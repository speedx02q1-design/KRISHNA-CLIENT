package com.krishna.client;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KrishnaClient implements ClientModInitializer {

    public static final String MOD_ID = "krishna_client";
    public static final Logger LOGGER =
            LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitializeClient() {
        LOGGER.info("KRISHNA CLIENT - PURPLE EDITION loaded!");
    }
}
