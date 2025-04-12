/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.sessions.api;

import com.google.firebase.sessions.api.FirebaseSessionsDependencies$Dependency;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1;
import com.google.firebase.sessions.api.SessionSubscriber;
import com.google.firebase.sessions.api.SessionSubscriber$Name;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

public final class FirebaseSessionsDependencies {
    public static final FirebaseSessionsDependencies INSTANCE;
    private static final String TAG = "SessionsDependencies";
    private static final Map dependencies;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        INSTANCE = linkedHashMap;
        linkedHashMap = new LinkedHashMap();
        dependencies = Collections.synchronizedMap(linkedHashMap);
    }

    private FirebaseSessionsDependencies() {
    }

    public static final void addDependency(SessionSubscriber$Name object) {
        Intrinsics.checkNotNullParameter(object, "subscriberName");
        Object object2 = SessionSubscriber$Name.PERFORMANCE;
        if (object != object2) {
            object2 = dependencies;
            boolean bl2 = object2.containsKey(object);
            if (bl2) {
                Objects.toString(object);
                return;
            }
            Intrinsics.checkNotNullExpressionValue(object2, "dependencies");
            ks1_1 ks1_12 = new ks1_1(true);
            FirebaseSessionsDependencies$Dependency firebaseSessionsDependencies$Dependency = new FirebaseSessionsDependencies$Dependency(ks1_12, null, 2, null);
            object2.put(object, firebaseSessionsDependencies$Dependency);
            Objects.toString(object);
            return;
        }
        object = new IllegalArgumentException("Incompatible versions of Firebase Perf and Firebase Sessions.\nA safe combination would be:\n  firebase-sessions:1.1.0\n  firebase-crashlytics:18.5.0\n  firebase-perf:20.5.0\nFor more information contact Firebase Support.");
        throw object;
    }

    private final FirebaseSessionsDependencies$Dependency getDependency(SessionSubscriber$Name object) {
        Object object2 = dependencies;
        CharSequence charSequence = "dependencies";
        Intrinsics.checkNotNullExpressionValue(object2, (String)charSequence);
        object2 = object2.get(object);
        if (object2 != null) {
            Intrinsics.checkNotNullExpressionValue(object2, "dependencies.getOrElse(s\u2026load time.\"\n      )\n    }");
            return (FirebaseSessionsDependencies$Dependency)object2;
        }
        charSequence = new StringBuilder("Cannot get dependency ");
        ((StringBuilder)charSequence).append(object);
        ((StringBuilder)charSequence).append(". Dependencies should be added at class load time.");
        object = ((StringBuilder)charSequence).toString();
        object2 = new IllegalStateException((String)object);
        throw object2;
    }

    public static final void register(SessionSubscriber sessionSubscriber) {
        Intrinsics.checkNotNullParameter(sessionSubscriber, "subscriber");
        SessionSubscriber$Name sessionSubscriber$Name = sessionSubscriber.getSessionSubscriberName();
        FirebaseSessionsDependencies$Dependency firebaseSessionsDependencies$Dependency = INSTANCE.getDependency(sessionSubscriber$Name);
        SessionSubscriber sessionSubscriber2 = firebaseSessionsDependencies$Dependency.getSubscriber();
        if (sessionSubscriber2 != null) {
            Objects.toString((Object)sessionSubscriber$Name);
            return;
        }
        firebaseSessionsDependencies$Dependency.setSubscriber(sessionSubscriber);
        Objects.toString((Object)sessionSubscriber$Name);
        firebaseSessionsDependencies$Dependency.getMutex().b(null);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object getRegisteredSubscribers$com_google_firebase_firebase_sessions(f80_0 var1_1) {
        block8: {
            block9: {
                var2_3 = var1_1 instanceof FirebaseSessionsDependencies$getRegisteredSubscribers$1;
                if (!var2_3) ** GOTO lbl-1000
                var3_4 = var1_1;
                var3_4 = (FirebaseSessionsDependencies$getRegisteredSubscribers$1)var1_1;
                var4_5 = var3_4.label;
                var5_6 = -1 << -1;
                var6_7 = var4_5 & var5_6;
                if (var6_7 != 0) {
                    var3_4.label = var4_5 -= var5_6;
                } else lbl-1000:
                // 2 sources

                {
                    var3_4 = new FirebaseSessionsDependencies$getRegisteredSubscribers$1(this, (f80_0)var1_1);
                }
                var1_1 = var3_4.result;
                var7_8 = j90_0.COROUTINE_SUSPENDED;
                var5_6 = var3_4.label;
                var6_7 = 1;
                if (var5_6 == 0) break block8;
                if (var5_6 != var6_7) break block9;
                var8_9 /* !! */  = var3_4.L$5;
                var9_10 /* !! */  = (LinkedHashMap<LinkedHashMap<K, V>, Object>)var3_4.L$4;
                var10_11 = (hs1_2)var3_4.L$3;
                var11_12 /* !! */  = (SessionSubscriber$Name)var3_4.L$2;
                var12_13 = (Iterator<T>)var3_4.L$1;
                var13_14 /* !! */  = (Map)var3_4.L$0;
                vl2_2.b(var1_1);
                ** GOTO lbl57
            }
            var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var1_1;
        }
        vl2_2.b(var1_1);
        var1_1 = FirebaseSessionsDependencies.dependencies;
        Intrinsics.checkNotNullExpressionValue(var1_1, "dependencies");
        var14_15 = eh1_2.c(var1_1.size());
        var8_9 /* !! */  = new LinkedHashMap<LinkedHashMap<K, V>, Object>(var14_15);
        var1_1 = ((Iterable)var1_1.entrySet()).iterator();
        var12_13 = var1_1;
        var9_10 /* !! */  = var8_9 /* !! */ ;
        while (var15_16 = var12_13.hasNext()) {
            var1_1 = (Map.Entry)var12_13.next();
            var8_9 /* !! */  = var1_1.getKey();
            var10_11 = var1_1.getKey();
            var11_12 /* !! */  = var10_11;
            var11_12 /* !! */  = (SessionSubscriber$Name)var10_11;
            var10_11 = ((FirebaseSessionsDependencies$Dependency)var1_1.getValue()).getMutex();
            var3_4.L$0 = var9_10 /* !! */ ;
            var3_4.L$1 = var12_13;
            var3_4.L$2 = var11_12 /* !! */ ;
            var3_4.L$3 = var10_11;
            var3_4.L$4 = var9_10 /* !! */ ;
            var3_4.L$5 = var8_9 /* !! */ ;
            var3_4.label = var6_7;
            var1_1 = var10_11.d(var3_4, null);
            if (var1_1 == var7_8) {
                return var7_8;
            }
            var13_14 /* !! */  = var9_10 /* !! */ ;
lbl57:
            // 3 sources

            var1_1 = FirebaseSessionsDependencies.INSTANCE;
            var1_1 = var1_1.getSubscriber$com_google_firebase_firebase_sessions(var11_12 /* !! */ );
            var9_10 /* !! */ .put(var8_9 /* !! */ , var1_1);
            var9_10 /* !! */  = var13_14 /* !! */ ;
            continue;
            finally {
                var10_11.b(null);
            }
        }
        return var9_10 /* !! */ ;
    }

    public final SessionSubscriber getSubscriber$com_google_firebase_firebase_sessions(SessionSubscriber$Name object) {
        Intrinsics.checkNotNullParameter(object, "subscriberName");
        Object object2 = this.getDependency((SessionSubscriber$Name)((Object)object)).getSubscriber();
        if (object2 != null) {
            return object2;
        }
        StringBuilder stringBuilder = new StringBuilder("Subscriber ");
        stringBuilder.append(object);
        stringBuilder.append(" has not been registered.");
        object = stringBuilder.toString();
        object2 = new IllegalStateException((String)object);
        throw object2;
    }

    public final void reset$com_google_firebase_firebase_sessions() {
        dependencies.clear();
    }
}

