/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class KeysMap {
    private final Map keys;
    private final int maxEntries;
    private final int maxEntryLength;

    public KeysMap(int n3, int n4) {
        HashMap hashMap;
        this.keys = hashMap = new HashMap();
        this.maxEntries = n3;
        this.maxEntryLength = n4;
    }

    private String sanitizeKey(String object) {
        if (object != null) {
            int n3 = this.maxEntryLength;
            return KeysMap.sanitizeString((String)object, n3);
        }
        object = new IllegalArgumentException("Custom attribute key must not be null.");
        throw object;
    }

    public static String sanitizeString(String string2, int n3) {
        int n4;
        if (string2 != null && (n4 = (string2 = string2.trim()).length()) > n3) {
            n4 = 0;
            string2 = string2.substring(0, n3);
        }
        return string2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Map getKeys() {
        synchronized (this) {
            Map map2 = this.keys;
            Map map3 = new Map(map2);
            return Collections.unmodifiableMap(map3);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean setKey(String string2, String object) {
        Object object2 = "Ignored entry \"";
        synchronized (this) {
            Throwable throwable2;
            CharSequence charSequence;
            block6: {
                try {
                    charSequence = this.sanitizeKey(string2);
                    Map map2 = this.keys;
                    int n3 = map2.size();
                    int n4 = this.maxEntries;
                    if (n3 >= n4 && (n3 = (int)((map2 = this.keys).containsKey(charSequence) ? 1 : 0)) == 0) {
                        object = Logger.getLogger();
                        charSequence = new StringBuilder((String)object2);
                        ((StringBuilder)charSequence).append(string2);
                        string2 = "\" when adding custom keys. Maximum allowable: ";
                        ((StringBuilder)charSequence).append(string2);
                        int n7 = this.maxEntries;
                        ((StringBuilder)charSequence).append(n7);
                        string2 = ((StringBuilder)charSequence).toString();
                        ((Logger)object).w(string2);
                        return false;
                    }
                    int n8 = this.maxEntryLength;
                    string2 = KeysMap.sanitizeString((String)object, n8);
                    object2 = this.keys;
                    object2 = object2.get(charSequence);
                    boolean bl2 = CommonUtils.nullSafeEquals((String)(object2 = (String)object2), string2);
                    if (!bl2) break block6;
                }
                catch (Throwable throwable2) {}
                return false;
            }
            object2 = this.keys;
            if (object == null) {
                string2 = "";
            }
            object2.put(charSequence, string2);
            return true;
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setKeys(Map object) {
        synchronized (this) {
            Object object2;
            Object object3;
            boolean bl2;
            String string2;
            int n3;
            try {
                object = object.entrySet();
                object = object.iterator();
                n3 = 0;
                string2 = null;
            }
            catch (Throwable throwable) {}
            throw throwable;
            while (bl2 = object.hasNext()) {
                int n4;
                object3 = object.next();
                object3 = (Map.Entry)object3;
                object2 = object3.getKey();
                object2 = (String)object2;
                object2 = this.sanitizeKey((String)object2);
                Map map2 = this.keys;
                int n7 = map2.size();
                if (n7 >= (n4 = this.maxEntries) && (n7 = (int)((map2 = this.keys).containsKey(object2) ? 1 : 0)) == 0) {
                    ++n3;
                    continue;
                }
                object3 = object3.getValue();
                object3 = (String)object3;
                map2 = this.keys;
                if (object3 == null) {
                    object3 = "";
                } else {
                    n4 = this.maxEntryLength;
                    object3 = KeysMap.sanitizeString((String)object3, n4);
                }
                map2.put(object2, object3);
            }
            if (n3 > 0) {
                object = Logger.getLogger();
                object3 = new StringBuilder();
                object2 = "Ignored ";
                ((StringBuilder)object3).append((String)object2);
                ((StringBuilder)object3).append(n3);
                string2 = " entries when adding custom keys. Maximum allowable: ";
                ((StringBuilder)object3).append(string2);
                n3 = this.maxEntries;
                ((StringBuilder)object3).append(n3);
                string2 = ((StringBuilder)object3).toString();
                ((Logger)object).w(string2);
            }
            return;
        }
    }
}

