/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.ota;

import in.juspay.hypersdk.ota.ReleaseConfig$Config;
import in.juspay.hypersdk.ota.ReleaseConfig$ResourceManifest;
import java.util.List;
import org.json.JSONObject;

public final class Constants {
    public static final String APP_DIR = "app";
    public static final String CONFIG_FILE_NAME = "config.json";
    private static final ReleaseConfig$Config DEFAULT_CONFIG;
    private static final ReleaseConfig$ResourceManifest DEFAULT_RESOURCES;
    public static final Constants INSTANCE;
    public static final String PACKAGE_DIR_NAME = "package";
    public static final String PACKAGE_MANIFEST_FILE_NAME = "pkg.json";
    public static final String PATCH_TOSS = "patch_toss";
    public static final String RESOURCES_DIR_NAME = "resources";
    public static final String RESOURCES_FILE_NAME = "resources.json";
    public static final int TOSS_TIMEOUT = 604800;

    static {
        Object object = new Constants();
        INSTANCE = object;
        JSONObject jSONObject = new JSONObject();
        Object object2 = object;
        DEFAULT_CONFIG = object = new ReleaseConfig$Config("v000000", 3000L, 7000L, jSONObject);
        object2 = mz0_2.a;
        DEFAULT_RESOURCES = object = new ReleaseConfig$ResourceManifest((List)object2);
    }

    private Constants() {
    }

    public final ReleaseConfig$Config getDEFAULT_CONFIG() {
        return DEFAULT_CONFIG;
    }

    public final ReleaseConfig$ResourceManifest getDEFAULT_RESOURCES() {
        return DEFAULT_RESOURCES;
    }
}

