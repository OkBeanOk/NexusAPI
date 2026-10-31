package com.okbeanok.nexusapi.internal.integration;

import org.bukkit.Material;

public record TropicPluginRegistryEntry(
		String pluginName,
		Material material,
		String description,
		boolean required,
		int slot
) {
}