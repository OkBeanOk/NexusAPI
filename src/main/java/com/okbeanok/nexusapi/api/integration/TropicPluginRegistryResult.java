package com.okbeanok.nexusapi.api.integration;

import com.okbeanok.nexusapi.internal.integration.TropicPluginRegistryEntry;

public record TropicPluginRegistryResult(
		TropicPluginRegistryEntry entry,
		boolean loaded,
		boolean enabled,
		String version
) {
}