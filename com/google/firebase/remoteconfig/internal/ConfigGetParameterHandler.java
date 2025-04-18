/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONException
 */
package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.common.util.BiConsumer;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigValue;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.FirebaseRemoteConfigValueImpl;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;

public class ConfigGetParameterHandler {
    static final Pattern FALSE_REGEX;
    public static final Charset FRC_BYTE_ARRAY_ENCODING;
    static final Pattern TRUE_REGEX;
    private final ConfigCacheClient activatedConfigsCache;
    private final ConfigCacheClient defaultConfigsCache;
    private final Executor executor;
    private final Set listeners;

    static {
        FRC_BYTE_ARRAY_ENCODING = Charset.forName("UTF-8");
        int n3 = 2;
        TRUE_REGEX = Pattern.compile("^(1|true|t|yes|y|on)$", n3);
        FALSE_REGEX = Pattern.compile("^(0|false|f|no|n|off|)$", n3);
    }

    public ConfigGetParameterHandler(Executor executor, ConfigCacheClient configCacheClient, ConfigCacheClient configCacheClient2) {
        HashSet hashSet;
        this.listeners = hashSet = new HashSet();
        this.executor = executor;
        this.activatedConfigsCache = configCacheClient;
        this.defaultConfigsCache = configCacheClient2;
    }

    public static /* synthetic */ void a(BiConsumer biConsumer, String string2, ConfigContainer configContainer) {
        biConsumer.accept(string2, configContainer);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void callListeners(String string2, ConfigContainer configContainer) {
        if (configContainer == null) {
            return;
        }
        Set set = this.listeners;
        synchronized (set) {
            try {
                Object object = this.listeners;
                object = object.iterator();
                while (true) {
                    boolean bl2;
                    if (!(bl2 = object.hasNext())) {
                        return;
                    }
                    Object object2 = object.next();
                    object2 = (BiConsumer)object2;
                    Executor executor = this.executor;
                    y40_0 y40_02 = new y40_0((BiConsumer)object2, string2, configContainer);
                    executor.execute(y40_02);
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    private static ConfigContainer getConfigsFromCache(ConfigCacheClient configCacheClient) {
        return configCacheClient.getBlocking();
    }

    private static Double getDoubleFromCache(ConfigCacheClient object, String string2) {
        if ((object = ConfigGetParameterHandler.getConfigsFromCache((ConfigCacheClient)object)) == null) {
            return null;
        }
        try {
            object = ((ConfigContainer)object).getConfigs();
        }
        catch (JSONException jSONException) {
            return null;
        }
        double d2 = object.getDouble(string2);
        return d2;
    }

    private static Set getKeySetFromCache(ConfigCacheClient object) {
        boolean bl2;
        HashSet<String> hashSet = new HashSet<String>();
        if ((object = ConfigGetParameterHandler.getConfigsFromCache((ConfigCacheClient)object)) == null) {
            return hashSet;
        }
        object = ((ConfigContainer)object).getConfigs().keys();
        while (bl2 = object.hasNext()) {
            String string2 = (String)object.next();
            hashSet.add(string2);
        }
        return hashSet;
    }

    private static TreeSet getKeysByPrefix(String string2, ConfigContainer object) {
        boolean bl2;
        TreeSet<String> treeSet = new TreeSet<String>();
        object = ((ConfigContainer)object).getConfigs().keys();
        while (bl2 = object.hasNext()) {
            String string3 = (String)object.next();
            boolean bl3 = string3.startsWith(string2);
            if (!bl3) continue;
            treeSet.add(string3);
        }
        return treeSet;
    }

    private static Long getLongFromCache(ConfigCacheClient object, String string2) {
        if ((object = ConfigGetParameterHandler.getConfigsFromCache((ConfigCacheClient)object)) == null) {
            return null;
        }
        try {
            object = ((ConfigContainer)object).getConfigs();
        }
        catch (JSONException jSONException) {
            return null;
        }
        long l2 = object.getLong(string2);
        return l2;
    }

    private static String getStringFromCache(ConfigCacheClient object, String string2) {
        if ((object = ConfigGetParameterHandler.getConfigsFromCache((ConfigCacheClient)object)) == null) {
            return null;
        }
        try {
            object = ((ConfigContainer)object).getConfigs();
        }
        catch (JSONException jSONException) {
            return null;
        }
        return object.getString(string2);
    }

    private static void logParameterValueDoesNotExist(String string2, String string3) {
        StringBuilder stringBuilder = new StringBuilder("No value of type '");
        stringBuilder.append(string3);
        stringBuilder.append("' exists for parameter key '");
        stringBuilder.append(string2);
        stringBuilder.append("'.");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void addListener(BiConsumer biConsumer) {
        Set set = this.listeners;
        synchronized (set) {
            Set set2 = this.listeners;
            set2.add(biConsumer);
            return;
        }
    }

    public Map getAll() {
        boolean bl2;
        Object object = new HashSet();
        HashMap<String, FirebaseRemoteConfigValue> hashMap = ConfigGetParameterHandler.getKeySetFromCache(this.activatedConfigsCache);
        object.addAll(hashMap);
        hashMap = ConfigGetParameterHandler.getKeySetFromCache(this.defaultConfigsCache);
        object.addAll(hashMap);
        hashMap = new HashMap<String, FirebaseRemoteConfigValue>();
        object = ((HashSet)object).iterator();
        while (bl2 = object.hasNext()) {
            String string2 = (String)object.next();
            FirebaseRemoteConfigValue firebaseRemoteConfigValue = this.getValue(string2);
            hashMap.put(string2, firebaseRemoteConfigValue);
        }
        return hashMap;
    }

    public boolean getBoolean(String string2) {
        boolean bl2;
        boolean bl3;
        Object object;
        Object object2 = ConfigGetParameterHandler.getStringFromCache(this.activatedConfigsCache, string2);
        boolean bl4 = true;
        if (object2 != null) {
            object = TRUE_REGEX.matcher((CharSequence)object2);
            bl3 = ((Matcher)object).matches();
            if (bl3) {
                object2 = ConfigGetParameterHandler.getConfigsFromCache(this.activatedConfigsCache);
                this.callListeners(string2, (ConfigContainer)object2);
                return bl4;
            }
            object = FALSE_REGEX;
            bl2 = ((Matcher)(object2 = ((Pattern)object).matcher((CharSequence)object2))).matches();
            if (bl2) {
                object2 = ConfigGetParameterHandler.getConfigsFromCache(this.activatedConfigsCache);
                this.callListeners(string2, (ConfigContainer)object2);
                return false;
            }
        }
        if ((object2 = ConfigGetParameterHandler.getStringFromCache(this.defaultConfigsCache, string2)) != null) {
            object = TRUE_REGEX.matcher((CharSequence)object2);
            bl3 = ((Matcher)object).matches();
            if (bl3) {
                return bl4;
            }
            Pattern pattern = FALSE_REGEX;
            bl2 = ((Matcher)(object2 = pattern.matcher((CharSequence)object2))).matches();
            if (bl2) {
                return false;
            }
        }
        ConfigGetParameterHandler.logParameterValueDoesNotExist(string2, "Boolean");
        return false;
    }

    public byte[] getByteArray(String object) {
        String string2 = ConfigGetParameterHandler.getStringFromCache(this.activatedConfigsCache, (String)object);
        if (string2 != null) {
            ConfigContainer configContainer = ConfigGetParameterHandler.getConfigsFromCache(this.activatedConfigsCache);
            this.callListeners((String)object, configContainer);
            object = FRC_BYTE_ARRAY_ENCODING;
            return string2.getBytes((Charset)object);
        }
        string2 = ConfigGetParameterHandler.getStringFromCache(this.defaultConfigsCache, (String)object);
        if (string2 != null) {
            object = FRC_BYTE_ARRAY_ENCODING;
            return string2.getBytes((Charset)object);
        }
        ConfigGetParameterHandler.logParameterValueDoesNotExist((String)object, "ByteArray");
        return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_BYTE_ARRAY;
    }

    public double getDouble(String string2) {
        Double d2 = ConfigGetParameterHandler.getDoubleFromCache(this.activatedConfigsCache, string2);
        if (d2 != null) {
            ConfigContainer configContainer = ConfigGetParameterHandler.getConfigsFromCache(this.activatedConfigsCache);
            this.callListeners(string2, configContainer);
            return d2;
        }
        d2 = ConfigGetParameterHandler.getDoubleFromCache(this.defaultConfigsCache, string2);
        if (d2 != null) {
            return d2;
        }
        ConfigGetParameterHandler.logParameterValueDoesNotExist(string2, "Double");
        return 0.0;
    }

    public Set getKeysByPrefix(String object) {
        if (object == null) {
            object = "";
        }
        TreeSet treeSet = new TreeSet();
        Object object2 = ConfigGetParameterHandler.getConfigsFromCache(this.activatedConfigsCache);
        if (object2 != null) {
            object2 = ConfigGetParameterHandler.getKeysByPrefix((String)object, (ConfigContainer)object2);
            treeSet.addAll(object2);
        }
        if ((object2 = ConfigGetParameterHandler.getConfigsFromCache(this.defaultConfigsCache)) != null) {
            object = ConfigGetParameterHandler.getKeysByPrefix((String)object, (ConfigContainer)object2);
            treeSet.addAll(object);
        }
        return treeSet;
    }

    public long getLong(String string2) {
        Long l2 = ConfigGetParameterHandler.getLongFromCache(this.activatedConfigsCache, string2);
        if (l2 != null) {
            ConfigContainer configContainer = ConfigGetParameterHandler.getConfigsFromCache(this.activatedConfigsCache);
            this.callListeners(string2, configContainer);
            return l2;
        }
        l2 = ConfigGetParameterHandler.getLongFromCache(this.defaultConfigsCache, string2);
        if (l2 != null) {
            return l2;
        }
        ConfigGetParameterHandler.logParameterValueDoesNotExist(string2, "Long");
        return 0L;
    }

    public String getString(String string2) {
        String string3 = ConfigGetParameterHandler.getStringFromCache(this.activatedConfigsCache, string2);
        if (string3 != null) {
            ConfigContainer configContainer = ConfigGetParameterHandler.getConfigsFromCache(this.activatedConfigsCache);
            this.callListeners(string2, configContainer);
            return string3;
        }
        string3 = ConfigGetParameterHandler.getStringFromCache(this.defaultConfigsCache, string2);
        if (string3 != null) {
            return string3;
        }
        ConfigGetParameterHandler.logParameterValueDoesNotExist(string2, "String");
        return "";
    }

    public FirebaseRemoteConfigValue getValue(String object) {
        String string2 = ConfigGetParameterHandler.getStringFromCache(this.activatedConfigsCache, (String)object);
        if (string2 != null) {
            ConfigContainer configContainer = ConfigGetParameterHandler.getConfigsFromCache(this.activatedConfigsCache);
            this.callListeners((String)object, configContainer);
            object = new FirebaseRemoteConfigValueImpl(string2, 2);
            return object;
        }
        string2 = ConfigGetParameterHandler.getStringFromCache(this.defaultConfigsCache, (String)object);
        if (string2 != null) {
            object = new FirebaseRemoteConfigValueImpl(string2, 1);
            return object;
        }
        ConfigGetParameterHandler.logParameterValueDoesNotExist((String)object, "FirebaseRemoteConfigValue");
        object = new FirebaseRemoteConfigValueImpl("", 0);
        return object;
    }
}

