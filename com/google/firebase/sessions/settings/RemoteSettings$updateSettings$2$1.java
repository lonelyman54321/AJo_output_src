/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.firebase.sessions.settings;

import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONException;
import org.json.JSONObject;

final class RemoteSettings$updateSettings$2$1
extends qg3_2
implements Function2 {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ RemoteSettings this$0;

    public RemoteSettings$updateSettings$2$1(RemoteSettings remoteSettings, f80_0 f80_02) {
        this.this$0 = remoteSettings;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        RemoteSettings remoteSettings = this.this$0;
        RemoteSettings$updateSettings$2$1 remoteSettings$updateSettings$2$1 = new RemoteSettings$updateSettings$2$1(remoteSettings, f80_02);
        remoteSettings$updateSettings$2$1.L$0 = object;
        return remoteSettings$updateSettings$2$1;
    }

    public final Object invoke(JSONObject object, f80_0 object2) {
        object = (RemoteSettings$updateSettings$2$1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((RemoteSettings$updateSettings$2$1)object).invokeSuspend(object2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object var1_1) {
        block26: {
            block33: {
                block32: {
                    block27: {
                        block28: {
                            block29: {
                                block31: {
                                    block30: {
                                        var2_2 = "cache_duration";
                                        var3_3 = "session_timeout_seconds";
                                        var4_4 = "sampling_rate";
                                        var5_5 = "sessions_enabled";
                                        var6_6 = j90_0.COROUTINE_SUSPENDED;
                                        var7_7 = this.label;
                                        switch (var7_7) {
                                            default: {
                                                var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                throw var1_1;
                                            }
                                            case 6: {
                                                vl2_2.b(var1_1);
                                                return Unit.a;
                                            }
                                            case 5: {
                                                vl2_2.b(var1_1);
                                                break block26;
                                            }
                                            case 4: {
                                                vl2_2.b(var1_1);
                                                break block27;
                                            }
                                            case 3: {
                                                var2_2 = (Ref$ObjectRef)this.L$0;
                                                vl2_2.b(var1_1);
                                                break block28;
                                            }
                                            case 2: {
                                                var2_2 = (Ref$ObjectRef)this.L$1;
                                                var3_3 = (Ref$ObjectRef)this.L$0;
                                                vl2_2.b(var1_1);
                                                break block29;
                                            }
                                            case 1: {
                                                var2_2 = (Ref$ObjectRef)this.L$2;
                                                var3_3 = (Ref$ObjectRef)this.L$1;
                                                var4_4 = (Ref$ObjectRef)this.L$0;
                                                vl2_2.b(var1_1);
                                                break;
                                            }
                                            case 0: {
                                                vl2_2.b(var1_1);
                                                var1_1 = (JSONObject)this.L$0;
                                                Objects.toString(var1_1);
                                                var8_8 = new Ref$ObjectRef();
                                                var9_9 = new Ref$ObjectRef();
                                                var10_10 = new Ref$ObjectRef();
                                                var11_11 = "app_quality";
                                                var12_12 = var1_1.has(var11_11);
                                                if (!var12_12) ** GOTO lbl77
                                                var1_1 = var1_1.get(var11_11);
                                                var11_11 = "null cannot be cast to non-null type org.json.JSONObject";
                                                Intrinsics.checkNotNull(var1_1, var11_11);
                                                var1_1 = (JSONObject)var1_1;
                                                try {
                                                    var13_13 = var1_1.has((String)var5_5);
                                                    if (!var13_13) ** GOTO lbl58
                                                    var5_5 = var1_1.get((String)var5_5);
                                                    var5_5 = (Boolean)var5_5;
                                                    ** GOTO lbl60
                                                }
                                                catch (JSONException v0) {
                                                    ** GOTO lbl77
                                                }
lbl58:
                                                // 1 sources

                                                var14_14 = 0;
                                                var5_5 = null;
lbl60:
                                                // 2 sources

                                                try {
                                                    var13_13 = var1_1.has((String)var4_4);
                                                    if (var13_13) {
                                                        var4_4 = var1_1.get((String)var4_4);
                                                        var8_8.element = var4_4 = (Double)var4_4;
                                                    }
                                                    ** GOTO lbl-1000
                                                }
                                                catch (JSONException v1) {}
                                                ** GOTO lbl79
lbl-1000:
                                                // 2 sources

                                                {
                                                    if ((var15_15 = (int)var1_1.has((String)var3_3)) != 0) {
                                                        var3_3 = var1_1.get((String)var3_3);
                                                        var9_9.element = var3_3 = (Integer)var3_3;
                                                    }
                                                    if ((var16_16 = (int)var1_1.has((String)var2_2)) != 0) {
                                                        var1_1 = var1_1.get((String)var2_2);
                                                        var10_10.element = var1_1 = (Integer)var1_1;
                                                    }
                                                    ** GOTO lbl79
                                                }
lbl77:
                                                // 2 sources

                                                var14_14 = 0;
                                                var5_5 = null;
lbl79:
                                                // 4 sources

                                                if (var5_5 == null) break block30;
                                                var1_1 = RemoteSettings.access$getSettingsCache(this.this$0);
                                                this.L$0 = var8_8;
                                                this.L$1 = var9_9;
                                                this.L$2 = var10_10;
                                                this.label = var17_17 = 1;
                                                if ((var1_1 = var1_1.updateSettingsEnabled((Boolean)var5_5, this)) == var6_6) {
                                                    return var6_6;
                                                }
                                                var4_4 = var8_8;
                                                var3_3 = var9_9;
                                                var2_2 = var10_10;
                                            }
                                        }
                                        var9_9 = var3_3;
                                        var3_3 = var4_4;
                                        break block31;
                                    }
                                    var3_3 = var8_8;
                                    var2_2 = var10_10;
                                }
                                var1_1 = (Integer)var9_9.element;
                                if (var1_1 != null) {
                                    var1_1 = RemoteSettings.access$getSettingsCache(this.this$0);
                                    var4_4 = (Integer)var9_9.element;
                                    this.L$0 = var3_3;
                                    this.L$1 = var2_2;
                                    this.L$2 = null;
                                    this.label = var14_14 = 2;
                                    if ((var1_1 = var1_1.updateSessionRestartTimeout((Integer)var4_4, this)) == var6_6) {
                                        return var6_6;
                                    }
                                }
                            }
                            var1_1 = (Double)var3_3.element;
                            if (var1_1 != null) {
                                var1_1 = RemoteSettings.access$getSettingsCache(this.this$0);
                                var3_3 = (Double)var3_3.element;
                                this.L$0 = var2_2;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.label = var15_15 = 3;
                                if ((var1_1 = var1_1.updateSamplingRate((Double)var3_3, this)) == var6_6) {
                                    return var6_6;
                                }
                            }
                        }
                        var1_1 = (Integer)var2_2.element;
                        if (var1_1 != null) {
                            var1_1 = RemoteSettings.access$getSettingsCache(this.this$0);
                            var2_2 = (Integer)var2_2.element;
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = var16_16 = 4;
                            if ((var1_1 = var1_1.updateSessionCacheDuration((Integer)var2_2, this)) == var6_6) {
                                return var6_6;
                            } else {
                                ** GOTO lbl130
                            }
                        }
                        break block32;
                    }
                    var1_1 = Unit.a;
                    break block33;
                }
                var1_1 = null;
            }
            if (var1_1 == null) {
                var1_1 = RemoteSettings.access$getSettingsCache(this.this$0);
                var2_2 = new Integer(86400);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = var16_16 = 5;
                if ((var1_1 = var1_1.updateSessionCacheDuration((Integer)var2_2, this)) == var6_6) {
                    return var6_6;
                }
            }
        }
        var1_1 = RemoteSettings.access$getSettingsCache(this.this$0);
        var18_18 = System.currentTimeMillis();
        var4_4 = new Long(var18_18);
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.label = var17_17 = 6;
        var1_1 = var1_1.updateSessionCacheUpdatedTime((Long)var4_4, this);
        if (var1_1 != var6_6) return Unit.a;
        return var6_6;
    }
}

