package com.hakydaki.tidal.client;

import com.hakydaki.tidal.Tidal;
import com.hakydaki.tidal.entity.custom.KoiEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class KoiModel extends AnimatedGeoModel<KoiEntity> {

    @Override
    public ResourceLocation getModelLocation(KoiEntity object) {
        return new ResourceLocation(Tidal.MOD_ID, "geo/koi.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(KoiEntity object) {
        return new ResourceLocation(Tidal.MOD_ID, "textures/entity/koi/koi.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(KoiEntity animatable) {
        return new ResourceLocation(Tidal.MOD_ID, "animations/koi.animation.json");
    }
}
