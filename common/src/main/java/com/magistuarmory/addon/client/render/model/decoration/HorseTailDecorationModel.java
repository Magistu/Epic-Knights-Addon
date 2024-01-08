package com.magistuarmory.addon.client.render.model.decoration;

import com.magistuarmory.client.render.model.decoration.ArmorDecorationModel;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.LivingEntity;

@Environment(EnvType.CLIENT)
public class HorseTailDecorationModel<T extends LivingEntity> extends ArmorDecorationModel<T>
{
	public HorseTailDecorationModel(ModelPart root)
	{
		super(root);
	}
	
	public static LayerDefinition createLayer() 
	{
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(60, 0).addBox(-0.5F, -13.5F, 0.0F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-0.005F, -13.0F, -0.75F, 0.005F, 15.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition tail_r1 = head.addOrReplaceChild("tail_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.005F, -37.0F, -0.75F, 0.005F, 15.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 0.1396F, 0.0F));

		PartDefinition tail_r2 = head.addOrReplaceChild("tail_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-0.005F, -37.0F, -0.75F, 0.005F, 15.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, -0.0698F, 0.0F));

		PartDefinition tail_r3 = head.addOrReplaceChild("tail_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.005F, -37.0F, -0.75F, 0.005F, 15.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, -0.1396F, 0.0F));

		PartDefinition tail_r4 = head.addOrReplaceChild("tail_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.005F, -37.0F, -0.75F, 0.005F, 15.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 0.0698F, 0.0F));

		PartDefinition spike_r1 = head.addOrReplaceChild("spike_r1", CubeListBuilder.create().texOffs(60, 0).addBox(-0.5F, -37.5F, 0.0F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		
		PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.offset(0.0F, 26.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(1.9F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}
}