package com.hakydaki.tidal.entity.custom;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class KoiEntity extends Animal implements IAnimatable {

    private AnimationFactory factory = new AnimationFactory(this);

    public KoiEntity(EntityType<? extends Animal> entityType, Level level) {
        super(entityType, level);
    }

    public static AttributeSupplier setAttributes() {
        return Animal.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 20.00)
                .add(Attributes.MOVEMENT_SPEED, 0.3f).build();
    }
    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel p_146743_, AgeableMob p_146744_) {
        return null;
    }

    //geckolib methods

    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {
        //if the entity is moving

        if (event.isMoving()) {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.koi.swim", true));
            return PlayState.CONTINUE;
        }

        //if the fish is out of the water

        //if (event.i) {
        //event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.koi.swim", true));
        //return PlayState.CONTINUE;
        //}

        event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.koi.idle", true));
        return PlayState.CONTINUE;
    }
    @Override
    public void registerControllers(AnimationData data) {
        data.addAnimationController(new AnimationController(this, "controller",
                0, this::predicate));
    }

    @Override
    public AnimationFactory getFactory() {
        return this.factory;
    }

    //SPACE TO PUT SOUNDS IN LATER
}
