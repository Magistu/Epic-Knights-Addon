package com.magistuarmory.addon.client.render.model.armor;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@Environment(EnvType.CLIENT)
public class VisoredKettlehatModel
{
	public static LayerDefinition createLayer()
	{
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(1, 12).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.7F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone_r1 = head.addOrReplaceChild("bone_r1", CubeListBuilder.create().texOffs(31, 0).mirror().addBox(-7.0F, 0.0F, -1.5F, 14.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.6601F, -3.016F, 0.0F, 0.0F, 1.5708F, -0.7854F));

		PartDefinition bone_r2 = head.addOrReplaceChild("bone_r2", CubeListBuilder.create().texOffs(31, 0).addBox(-7.0F, 0.0F, -1.5F, 14.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.016F, 5.6601F, -2.3562F, 0.0F, 3.1416F));

		PartDefinition bone_r3 = head.addOrReplaceChild("bone_r3", CubeListBuilder.create().texOffs(31, 0).addBox(-7.0F, 0.0F, -1.5F, 14.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.6601F, -3.016F, 0.0F, 0.0F, -1.5708F, 0.7854F));

		PartDefinition bone_r4 = head.addOrReplaceChild("bone_r4", CubeListBuilder.create().texOffs(31, 3).addBox(-7.0F, 0.0F, -1.5F, 15.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0561F, -5.5751F, 0.7854F, 0.0F, 0.0F));

		PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}
}