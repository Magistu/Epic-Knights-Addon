package com.magistuarmory.addon.client.render.model.armor;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@Environment(EnvType.CLIENT)
public class BritishArmetModel
{
	public static LayerDefinition createLayer()
	{
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(34, 0).addBox(-4.0F, -7.9F, -3.2F, 8.0F, 7.0F, 7.0F, new CubeDeformation(1.0F))
				.texOffs(40, 6).addBox(-4.0F, -7.9F, -3.7F, 8.0F, 7.0F, 1.0F, new CubeDeformation(0.97F)), PartPose.offset(0.0F, 1.0F, 0.0F));

		PartDefinition head_r1 = head.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(35, 18).mirror().addBox(-4.0F, -4.0F, -0.5F, 8.0F, 8.0F, 1.0F, new CubeDeformation(1.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.9F, 3.8F, 0.0F, 0.0F, -0.7854F));

		PartDefinition head_r2 = head.addOrReplaceChild("head_r2", CubeListBuilder.create().texOffs(35, 18).addBox(-4.0F, -4.0F, -0.5F, 8.0F, 8.0F, 1.0F, new CubeDeformation(1.0F)), PartPose.offsetAndRotation(0.0F, -1.9F, 3.8F, 0.0F, 0.0F, 0.7854F));

		PartDefinition mask = head.addOrReplaceChild("mask", CubeListBuilder.create(), PartPose.offset(0.0F, -4.0F, -5.0F));

		PartDefinition lmask = mask.addOrReplaceChild("lmask", CubeListBuilder.create(), PartPose.offset(0.0F, 29.0F, 4.0F));

		PartDefinition cube_r1 = lmask.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(8, 24).mirror().addBox(-2.0F, 0.2F, -2.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.8601F, -29.9786F, -5.9254F, 0.655F, -0.1947F, 0.2476F));

		PartDefinition cube_r2 = lmask.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(8, 24).addBox(1.0F, 0.2F, -2.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8601F, -29.9786F, -5.9254F, 0.655F, 0.1947F, -0.2476F));

		PartDefinition cube_r3 = lmask.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(8, 12).mirror().addBox(-2.5F, 0.0F, -2.45F, 5.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3892F, -30.5749F, -4.9953F, 0.7396F, 0.4806F, 0.004F));

		PartDefinition cube_r4 = lmask.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(10, 17).addBox(-2.9F, 0.0F, -0.5F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3682F, -29.3716F, -6.196F, 0.4856F, 0.4784F, 0.0127F));

		PartDefinition rmask = mask.addOrReplaceChild("rmask", CubeListBuilder.create(), PartPose.offset(0.0F, 29.0F, 4.0F));

		PartDefinition cube_r5 = rmask.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(8, 24).mirror().addBox(1.5F, 0.2F, -2.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8602F, -29.9786F, -5.9254F, 0.655F, 0.1947F, -0.2476F));

		PartDefinition cube_r6 = rmask.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(8, 24).addBox(-2.5F, 0.2F, -2.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8602F, -29.9786F, -5.9254F, 0.655F, -0.1947F, 0.2476F));

		PartDefinition cube_r7 = rmask.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(8, 12).addBox(-2.5F, 0.0F, -2.45F, 5.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3892F, -30.5749F, -4.9953F, 0.7396F, -0.4806F, -0.004F));

		PartDefinition cube_r8 = rmask.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(10, 17).mirror().addBox(-3.1F, 0.0F, -0.5F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.3682F, -29.3716F, -6.196F, 0.4856F, -0.4784F, -0.0127F));

		PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}
}