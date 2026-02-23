package com.magistuarmory.addon.client.render.model.armor;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@Environment(EnvType.CLIENT)
public class SavoyardHelmetModel
{
	public static LayerDefinition createLayer()
	{
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(34, 0).addBox(-4.0F, -7.9F, -3.2F, 8.0F, 8.0F, 7.0F, new CubeDeformation(0.8F))
				.texOffs(12, 9).addBox(0.0F, -10.25F, -4.45F, 0.0F, 6.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(40, 6).addBox(-4.0F, -7.9F, -3.8F, 8.0F, 8.0F, 1.0F, new CubeDeformation(0.77F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(45, 18).mirror().addBox(-4.0F, -6.0F, -1.0F, 5.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.65F, 0.4F, -4.7F, 0.0F, 0.3054F, 0.0F));

		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(43, 24).mirror().addBox(-1.0F, -6.0F, -1.0F, 5.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.65F, 0.4F, -4.7F, 0.0F, -0.3054F, 0.0F));

		PartDefinition bone = head.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 28).addBox(-3.75F, -0.3769F, -2.0F, 3.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 28).mirror().addBox(0.75F, -0.3769F, -2.0F, 3.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, -5.1231F, -5.0F));

		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(21, 28).mirror().addBox(-0.4F, -0.1F, -2.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1769F, 0.0F, 0.0F, 0.0F, 0.4363F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(21, 28).addBox(-0.6F, -0.1F, -2.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1769F, 0.0F, 0.0F, 0.0F, -0.4363F));

		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(-4, 28).addBox(-0.75F, -0.25F, -2.0F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 0.1731F, 0.0F, 0.0F, 0.0F, 0.4363F));

		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(-4, 28).mirror().addBox(-1.25F, -0.25F, -2.0F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 0.1731F, 0.0F, 0.0F, 0.0F, -0.4363F));

		PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}
}