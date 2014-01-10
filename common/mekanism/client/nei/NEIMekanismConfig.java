package mekanism.client.nei;

import mekanism.client.gui.GuiChemicalInfuser;
import mekanism.client.gui.GuiChemicalInjectionChamber;
import mekanism.client.gui.GuiChemicalOxidizer;
import mekanism.client.gui.GuiCombiner;
import mekanism.client.gui.GuiCrusher;
import mekanism.client.gui.GuiEnrichmentChamber;
import mekanism.client.gui.GuiMetallurgicInfuser;
import mekanism.client.gui.GuiOsmiumCompressor;
import mekanism.client.gui.GuiPurificationChamber;
import mekanism.client.gui.GuiRotaryCondensentrator;
import mekanism.common.Mekanism;
import codechicken.nei.api.API;
import codechicken.nei.api.IConfigureNEI;

public class NEIMekanismConfig implements IConfigureNEI
{
	@Override
	public void loadConfig()
	{
		API.registerRecipeHandler(new EnrichmentChamberRecipeHandler());
		API.registerUsageHandler(new EnrichmentChamberRecipeHandler());
		
		API.registerRecipeHandler(new OsmiumCompressorRecipeHandler());
		API.registerUsageHandler(new OsmiumCompressorRecipeHandler());
		
		API.registerRecipeHandler(new CrusherRecipeHandler());
		API.registerUsageHandler(new CrusherRecipeHandler());
		
		API.registerRecipeHandler(new CombinerRecipeHandler());
		API.registerUsageHandler(new CombinerRecipeHandler());
		
		API.registerRecipeHandler(new MetallurgicInfuserRecipeHandler());
		API.registerUsageHandler(new MetallurgicInfuserRecipeHandler());
		
		API.registerRecipeHandler(new PurificationChamberRecipeHandler());
		API.registerUsageHandler(new PurificationChamberRecipeHandler());
		
		API.registerRecipeHandler(new ChemicalInjectionChamberRecipeHandler());
		API.registerUsageHandler(new ChemicalInjectionChamberRecipeHandler());
		
		API.registerRecipeHandler(new MekanismRecipeHandler());
		API.registerUsageHandler(new MekanismRecipeHandler());
		
		API.registerRecipeHandler(new ChemicalOxidizerRecipeHandler());
		API.registerUsageHandler(new ChemicalOxidizerRecipeHandler());
		
		API.registerRecipeHandler(new ChemicalInfuserRecipeHandler());
		API.registerUsageHandler(new ChemicalInfuserRecipeHandler());
		
		API.registerRecipeHandler(new RotaryCondensentratorRecipeHandler());
		API.registerUsageHandler(new RotaryCondensentratorRecipeHandler());
		
		API.setGuiOffset(GuiEnrichmentChamber.class, 16, 6);
		API.setGuiOffset(GuiOsmiumCompressor.class, 16, 6);
		API.setGuiOffset(GuiCrusher.class, 16, 6);
		API.setGuiOffset(GuiCombiner.class, 16, 6);
		API.setGuiOffset(GuiPurificationChamber.class, 16, 6);
		API.setGuiOffset(GuiChemicalInjectionChamber.class, 16, 6);
		API.setGuiOffset(GuiMetallurgicInfuser.class, 5, 15);
		API.setGuiOffset(GuiChemicalOxidizer.class, ChemicalOxidizerRecipeHandler.xOffset, ChemicalOxidizerRecipeHandler.yOffset);
		API.setGuiOffset(GuiChemicalInfuser.class, ChemicalInfuserRecipeHandler.xOffset, ChemicalInfuserRecipeHandler.yOffset);
		API.setGuiOffset(GuiRotaryCondensentrator.class, RotaryCondensentratorRecipeHandler.xOffset, RotaryCondensentratorRecipeHandler.yOffset);
		
		API.hideItem(Mekanism.boundingBlockID);
		API.hideItem(Mekanism.ItemProxy.itemID);
	}

	@Override
	public String getName()
	{
		return "Mekanism NEI Plugin";
	}

	@Override
	public String getVersion()
	{
		return "1.1";
	}
}
