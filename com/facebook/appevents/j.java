/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.preference.PreferenceManager
 *  android.util.Patterns
 */
package com.facebook.appevents;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Patterns;
import com.facebook.FacebookSdk;
import java.util.AbstractSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

public final class j {
    public static final j a;
    public static SharedPreferences b;
    public static final AtomicBoolean c;
    public static final ConcurrentHashMap d;
    public static final ConcurrentHashMap e;

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        a = concurrentHashMap;
        concurrentHashMap = new ConcurrentHashMap(false);
        c = concurrentHashMap;
        d = concurrentHashMap = new ConcurrentHashMap();
        e = concurrentHashMap = new ConcurrentHashMap();
    }

    public final HashMap a() {
        Throwable throwable2;
        block23: {
            HashMap hashMap;
            block22: {
                Object object;
                boolean bl2 = td0.b(this);
                if (bl2) {
                    return null;
                }
                hashMap = new HashMap();
                AbstractSet abstractSet = ko1_1.d;
                abstractSet = new HashSet();
                Object object2 = ko1_1.a();
                object2 = ((CopyOnWriteArraySet)object2).iterator();
                while (true) {
                    boolean bl3 = object2.hasNext();
                    if (!bl3) break;
                    object = object2.next();
                    object = (ko1_1)object;
                    object = ((ko1_1)object).c();
                    ((HashSet)abstractSet).add(object);
                    continue;
                    break;
                }
                object2 = e;
                object = ((ConcurrentHashMap)object2).keySet();
                try {
                    object = object.iterator();
                }
                catch (Throwable throwable2) {}
                while (true) {
                    boolean bl4 = object.hasNext();
                    if (!bl4) break block22;
                    break;
                }
                {
                    Object object3 = object.next();
                    object3 = (String)object3;
                    boolean bl5 = ((HashSet)abstractSet).contains(object3);
                    if (!bl5) continue;
                    Object v4 = ((ConcurrentHashMap)object2).get(object3);
                    hashMap.put(object3, v4);
                    continue;
                }
                break block23;
            }
            return hashMap;
        }
        td0.a(this, throwable2);
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b() {
        synchronized (this) {
            Throwable throwable2;
            block13: {
                String string2;
                Object object;
                boolean bl2;
                AtomicBoolean atomicBoolean;
                block12: {
                    boolean bl3 = td0.b(this);
                    if (bl3) {
                        return;
                    }
                    try {
                        atomicBoolean = c;
                        bl2 = atomicBoolean.get();
                        if (!bl2) break block12;
                    }
                    catch (Throwable throwable2) {
                        break block13;
                    }
                    return;
                }
                Object object2 = FacebookSdk.a();
                object2 = PreferenceManager.getDefaultSharedPreferences((Context)object2);
                Object object3 = "getDefaultSharedPreferen\u2026.getApplicationContext())";
                Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
                b = object2;
                object3 = null;
                if (object2 == null) {
                    object2 = "sharedPreferences";
                    Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                    bl2 = false;
                    object2 = null;
                }
                if ((object2 = object2.getString((String)(object = "com.facebook.appevents.UserDataStore.userData"), string2 = "")) == null) {
                    object2 = "";
                }
                if ((object = b) == null) {
                    object = "sharedPreferences";
                    Intrinsics.throwUninitializedPropertyAccessException((String)object);
                } else {
                    object3 = object;
                }
                object = "com.facebook.appevents.UserDataStore.internalUserData";
                string2 = "";
                object3 = object3.getString((String)object, string2);
                if (object3 == null) {
                    object3 = "";
                }
                object = d;
                object2 = lz3_0.D((String)object2);
                ((ConcurrentHashMap)object).putAll(object2);
                object2 = e;
                object3 = lz3_0.D((String)object3);
                ((ConcurrentHashMap)object2).putAll(object3);
                bl2 = true;
                atomicBoolean.set(bl2);
                return;
            }
            td0.a(this, throwable2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String c(String object, String charSequence) {
        Throwable throwable2;
        block11: {
            boolean bl2;
            Object object2;
            int n3;
            int n4;
            int n7 = td0.b(this);
            if (n7 != 0) {
                return null;
            }
            try {
                n7 = charSequence.length();
                n4 = 1;
                n7 -= n4;
                n3 = 0;
                object2 = null;
                bl2 = false;
            }
            catch (Throwable throwable2) {
                break block11;
            }
            while (n3 <= n7) {
                int n8 = !bl2 ? n3 : n7;
                n8 = charSequence.charAt(n8);
                int n10 = 32;
                n8 = Intrinsics.compare(n8, n10);
                n8 = n8 <= 0 ? 1 : 0;
                if (!bl2) {
                    if (n8 == 0) {
                        bl2 = true;
                        continue;
                    }
                    ++n3;
                    continue;
                }
                if (n8 == 0) break;
                n7 += -1;
            }
            charSequence = charSequence.subSequence(n3, n7 += n4);
            charSequence = charSequence.toString();
            charSequence = ((String)charSequence).toLowerCase();
            String string2 = "this as java.lang.String).toLowerCase()";
            Intrinsics.checkNotNullExpressionValue(charSequence, string2);
            string2 = "em";
            n7 = (int)(Intrinsics.areEqual(string2, object) ? 1 : 0);
            object2 = "";
            if (n7 != 0) {
                object = Patterns.EMAIL_ADDRESS;
                boolean bl3 = ((Matcher)(object = ((Pattern)object).matcher(charSequence))).matches();
                if (!bl3) return object2;
                return charSequence;
            }
            string2 = "ph";
            n7 = (int)(Intrinsics.areEqual(string2, object) ? 1 : 0);
            if (n7 != 0) {
                string2 = "[^0-9]";
                object = new Regex(string2);
                return ((Regex)object).replace(charSequence, (String)object2);
            }
            string2 = "ge";
            int n14 = Intrinsics.areEqual(string2, object);
            if (n14 == 0) return charSequence;
            n14 = charSequence.length();
            if (n14 > 0) {
                object = ((String)charSequence).substring(0, n4);
                charSequence = "this as java.lang.String\u2026ing(startIndex, endIndex)";
                Intrinsics.checkNotNullExpressionValue(object, (String)charSequence);
            } else {
                object = object2;
            }
            charSequence = "f";
            boolean bl4 = Intrinsics.areEqual(charSequence, object);
            if (bl4) return object;
            charSequence = "m";
            bl4 = Intrinsics.areEqual(charSequence, object);
            if (!bl4) return object2;
            return object;
        }
        td0.a(this, throwable2);
        return null;
    }
}

