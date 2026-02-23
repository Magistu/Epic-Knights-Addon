package com.magistuarmory.addon.client.render.model.armor;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@Environment(EnvType.CLIENT)
public class FacialGrotesqueMaximilianHelmetModel
{
	public static LayerDefinition createLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(32, 0).addBox(-4.0F, -7.85F, -3.2F, 8.0F, 7.0F, 7.0F, new CubeDeformation(0.9F))
				.texOffs(38, 6).addBox(-4.0F, -7.85F, -3.7F, 8.0F, 7.0F, 1.0F, new CubeDeformation(0.87F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition mask2 = head.addOrReplaceChild("mask2", CubeListBuilder.create().texOffs(14, 0).addBox(-0.6F, -28.25F, -7.75F, 1.25F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 23.0F, 0.25F));

		PartDefinition rmask2 = mask2.addOrReplaceChild("rmask2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition rmask_r1 = rmask2.addOrReplaceChild("rmask_r1", CubeListBuilder.create().texOffs(0, 5).mirror().addBox(-6.9858F, -0.0438F, 0.2413F, 7.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -28.1F, -8.05F, 0.4211F, 0.4648F, 0.0F));

		PartDefinition rmask_r2 = rmask2.addOrReplaceChild("rmask_r2", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-6.9858F, -5.2446F, 0.0868F, 7.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -28.1F, -8.05F, -0.8138F, 0.4648F, 0.0F));

		PartDefinition lmask2 = mask2.addOrReplaceChild("lmask2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition lmask_r1 = lmask2.addOrReplaceChild("lmask_r1", CubeListBuilder.create().texOffs(0, 5).addBox(-0.0142F, -0.0438F, 0.2413F, 7.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -28.1F, -8.05F, 0.4211F, -0.4648F, 0.0F));

		PartDefinition lmask_r2 = lmask2.addOrReplaceChild("lmask_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-0.0142F, -5.2446F, 0.0868F, 7.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -28.1F, -8.05F, -0.8138F, -0.4648F, 0.0F));

		PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}
}