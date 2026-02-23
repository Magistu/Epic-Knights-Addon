package com.magistuarmory.addon.client.render.model.armor;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class LobsterTailedHelmetModel
{
    public static LayerDefinition createLayer() 
    {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.6F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition head_r1 = head.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(0, 25).addBox(-5.0F, 0.0F, -1.0F, 10.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, 4.0F, 0.6981F, 0.0F, 0.0F));

        PartDefinition head_r2 = head.addOrReplaceChild("head_r2", CubeListBuilder.create().texOffs(48, 0).addBox(0.6F, 0.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.6F)), PartPose.offsetAndRotation(0.0F, -5.0F, -5.0F, 0.1819F, -0.009F, 0.0859F));

        PartDefinition head_r3 = head.addOrReplaceChild("head_r3", CubeListBuilder.create().texOffs(48, 5).addBox(-4.5F, 0.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.6F)), PartPose.offsetAndRotation(0.0F, -5.0F, -5.0F, 0.1819F, 0.009F, -0.0859F));

        PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offset(-5.0F, 2.0F, 0.0F));

        PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offset(5.0F, 2.0F, 0.0F));

        PartDefinition right_arm2 = partdefinition.addOrReplaceChild("right_arm2", CubeListBuilder.create(), PartPose.offset(-1.9F, 12.0F, 0.0F));

        PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(1.9F, 12.0F, 0.0F));

        PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(-1.9F, 12.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 64, 32);
    }
}
