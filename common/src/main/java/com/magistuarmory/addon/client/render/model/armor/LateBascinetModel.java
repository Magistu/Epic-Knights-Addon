package com.magistuarmory.addon.client.render.model.armor;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class LateBascinetModel
{
    public static LayerDefinition createLayer() 
    {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -7.75F, -3.2F, 8.0F, 7.0F, 7.0F, new CubeDeformation(0.9F))
                .texOffs(6, 6).addBox(-4.0F, -7.75F, -3.7F, 8.0F, 7.0F, 1.0F, new CubeDeformation(0.87F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 26).addBox(-4.0F, -1.5F, -1.5F, 9.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, -3.1F, -4.6F, 0.7854F, 0.0F, 0.0F));

        PartDefinition head_r1 = head.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(41, 0).addBox(-4.0F, 0.289F, -5.61F, 8.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.8F, -4.7F, 0.672F, 0.0F, 0.0F));

        PartDefinition head_r2 = head.addOrReplaceChild("head_r2", CubeListBuilder.create().texOffs(42, 7).addBox(-4.0F, 0.022F, -1.3237F, 8.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.672F, -7.8663F, -0.4363F, 0.0F, 0.0F));

        PartDefinition head_r3 = head.addOrReplaceChild("head_r3", CubeListBuilder.create().texOffs(0, 14).addBox(-4.5F, -1.0F, -1.0F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.8908F, -4.5101F, 0.7854F, 0.0F, 0.0F));

        PartDefinition head_r4 = head.addOrReplaceChild("head_r4", CubeListBuilder.create().texOffs(50, 21).addBox(-0.6F, -1.0F, -6.7F, 0.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -3.3F, -5.0F, 0.0F, 0.6615F, 0.0F));

        PartDefinition head_r5 = head.addOrReplaceChild("head_r5", CubeListBuilder.create().texOffs(50, 16).mirror().addBox(-5.75F, -1.0F, -1.7F, 0.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.0F, -3.6F, -4.9F, 0.0F, -0.6615F, 0.0F));

        PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 64, 32);
    }
}
