package com.magistuarmory.addon.client.render.model.decoration;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@Environment(EnvType.CLIENT)
public class FrontalFeatherModel
{
	public static LayerDefinition createLayer()
	{
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition feather_middle_r1 = head.addOrReplaceChild("feather_middle_r1", CubeListBuilder.create().texOffs(0, 8).mirror().addBox(-8.0F, -8.0F, 0.0F, 16.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2429F, -15.8995F, -2.125F, -1.3526F, 0.5672F, 0.7854F));

		PartDefinition feather_middle_r2 = head.addOrReplaceChild("feather_middle_r2", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-8.0F, 0.0F, 0.0F, 16.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0179F, -15.8995F, -1.925F, -0.2182F, 0.5585F, 0.6545F));

		PartDefinition feather_middle_r3 = head.addOrReplaceChild("feather_middle_r3", CubeListBuilder.create().texOffs(0, 8).addBox(-8.0F, -8.0F, 0.0F, 16.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2429F, -15.8995F, -2.125F, -1.3526F, -0.5672F, -0.7854F));

		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 27).addBox(-0.5F, -3.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.0F, -6.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition feather_middle_r4 = head.addOrReplaceChild("feather_middle_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, 0.0F, 0.0F, 16.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0179F, -15.8995F, -1.925F, -0.2182F, -0.5585F, -0.6545F));

		PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(1.9F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}
}