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
				.texOffs(0, 19).mirror().addBox(0.0F, -9.6F, -3.5F, 0.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(40, 6).addBox(-4.0F, -7.9F, -3.7F, 8.0F, 7.0F, 1.0F, new CubeDeformation(0.97F)), PartPose.offset(0.0F, 1.0F, 0.0F));

		PartDefinition head_r1 = head.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(35, 18).addBox(-4.0F, -4.0F, -0.5F, 8.0F, 8.0F, 1.0F, new CubeDeformation(1.0F)), PartPose.offsetAndRotation(0.0F, -1.9F, 3.8F, 0.0F, 0.0F, 0.7854F));

		PartDefinition mask = head.addOrReplaceChild("mask", CubeListBuilder.create(), PartPose.offset(0.0F, 25.0F, 0.0F));

		PartDefinition lmask = mask.addOrReplaceChild("lmask", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = lmask.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 14).addBox(-0.75F, -25.0F, 13.85F, 5.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -0.5F, 0.7182F, 0.4317F, -0.0445F));

		PartDefinition cube_r2 = lmask.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(15, 25).mirror().addBox(-6.0F, -14.0F, -22.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.0F, -0.5F, -0.745F, 0.3054F, 0.131F));

		PartDefinition cube_r3 = lmask.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(11, 18).addBox(-3.0F, 0.0F, -0.5F, 6.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3682F, -29.3716F, -6.196F, 0.4856F, 0.4784F, 0.0127F));

		PartDefinition rmask = mask.addOrReplaceChild("rmask", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r4 = rmask.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(10, 14).addBox(-4.15F, -25.0F, 13.85F, 5.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -0.5F, 0.7182F, -0.4317F, 0.0445F));

		PartDefinition cube_r5 = rmask.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(15, 25).addBox(1.0F, -14.0F, -22.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -0.5F, -0.745F, -0.3054F, -0.131F));

		PartDefinition cube_r6 = rmask.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(11, 18).mirror().addBox(-3.0F, 0.0F, -0.5F, 6.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.3682F, -29.3716F, -6.196F, 0.4856F, -0.4784F, -0.0127F));

		PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}
}