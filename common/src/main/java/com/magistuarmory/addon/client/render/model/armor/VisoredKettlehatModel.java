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

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 12).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(1.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bone_r1 = head.addOrReplaceChild("bone_r1", CubeListBuilder.create().texOffs(29, 0).mirror().addBox(-8.0F, -0.3F, -2.7F, 16.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.6F, 4.9F, 0.6981F, -3.1416F, 0.0F));

		PartDefinition bone_r2 = head.addOrReplaceChild("bone_r2", CubeListBuilder.create().texOffs(29, 0).mirror().addBox(-7.9F, -0.3F, -2.7F, 16.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -3.6F, 0.1F, 0.0F, 1.5708F, -0.6981F));

		PartDefinition bone_r3 = head.addOrReplaceChild("bone_r3", CubeListBuilder.create().texOffs(29, 0).addBox(-8.1F, -0.3F, -2.7F, 16.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -3.6F, 0.1F, 0.0F, -1.5708F, 0.6981F));

		PartDefinition bone_r4 = head.addOrReplaceChild("bone_r4", CubeListBuilder.create().texOffs(29, 3).addBox(-8.0F, -0.8F, -2.3F, 16.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, -5.0F, 0.6981F, 0.0F, 0.0F));
		partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.ZERO);
		partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.ZERO);
		partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.ZERO);
		partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.ZERO);
		partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.ZERO);
		partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.ZERO);
		return LayerDefinition.create(meshdefinition, 64, 64);
	}
}