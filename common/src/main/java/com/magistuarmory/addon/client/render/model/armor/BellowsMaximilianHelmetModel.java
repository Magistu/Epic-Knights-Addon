package com.magistuarmory.addon.client.render.model.armor;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@Environment(EnvType.CLIENT)
public class BellowsMaximilianHelmetModel
{
	public static LayerDefinition createLayer()
	{
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(32, 0).addBox(-4.0F, -7.85F, -3.2F, 8.0F, 7.0F, 7.0F, new CubeDeformation(0.9F))
				.texOffs(38, 6).addBox(-4.0F, -7.85F, -3.7F, 8.0F, 7.0F, 1.0F, new CubeDeformation(0.87F))
				.texOffs(16, 15).addBox(-3.5F, -8.5F, -4.5F, 7.0F, 8.0F, 9.0F, new CubeDeformation(0.3F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 9).addBox(-4.5F, -2.0F, -1.5F, 9.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5F, -4.5F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 20).addBox(-4.5F, -1.5F, -1.5F, 9.0F, 3.0F, 3.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(0.0F, -4.5F, -4.5F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r3 = head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 15).addBox(-4.5F, -2.7F, -1.5F, 9.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -4.5F, -0.7854F, 0.0F, 0.0F));

		PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.offset(0.0F, 26.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(1.9F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}
}
