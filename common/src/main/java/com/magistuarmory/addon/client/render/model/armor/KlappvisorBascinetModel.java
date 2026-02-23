package com.magistuarmory.addon.client.render.model.armor;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class KlappvisorBascinetModel
{
    public static LayerDefinition createLayer() 
    {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(41, 2).addBox(-4.0F, -4.2F, -5.1F, 8.0F, 5.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-4.0F, -7.75F, -3.2F, 8.0F, 7.0F, 7.0F, new CubeDeformation(0.9F))
                .texOffs(6, 6).addBox(-4.0F, -7.75F, -3.7F, 8.0F, 7.0F, 1.0F, new CubeDeformation(0.87F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition head_r1 = head.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(0, 14).addBox(-4.0F, 1.05F, -1.65F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.8F, -5.5F, 0.7854F, 0.0F, 0.0F));

        PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 64, 32);
    }
}
