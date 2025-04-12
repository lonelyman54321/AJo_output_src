/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences$Editor
 */
package com.google.android.gms.internal.consent_sdk;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.internal.consent_sdk.zzcm;
import com.google.android.gms.internal.consent_sdk.zzco;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class zzcn {
    private final Context zza;
    private final Map zzb;

    public zzcn(Context context) {
        HashMap hashMap;
        this.zzb = hashMap = new HashMap();
        this.zza = context;
    }

    public static /* bridge */ /* synthetic */ SharedPreferences.Editor zza(zzcn zzcn2, String string2) {
        return zzcn2.zzd(string2);
    }

    private final SharedPreferences.Editor zzd(String string2) {
        Map map2 = this.zzb;
        boolean bl2 = map2.containsKey(string2);
        if (!bl2) {
            map2 = this.zzb;
            SharedPreferences.Editor editor = this.zza.getSharedPreferences(string2, 0).edit();
            map2.put(string2, editor);
        }
        return (SharedPreferences.Editor)this.zzb.get(string2);
    }

    public final void zzb() {
        boolean bl2;
        Iterator iterator = this.zzb.values().iterator();
        while (bl2 = iterator.hasNext()) {
            SharedPreferences.Editor editor = (SharedPreferences.Editor)iterator.next();
            editor.apply();
        }
    }

    public final boolean zzc(String object, Object object2) {
        block10: {
            block5: {
                boolean bl2;
                String string2;
                block9: {
                    block8: {
                        block7: {
                            block6: {
                                block4: {
                                    if ((object = zzco.zza(this.zza, (String)object)) == null) {
                                        return false;
                                    }
                                    string2 = ((zzcm)object).zza;
                                    string2 = this.zzd(string2);
                                    bl2 = object2 instanceof Integer;
                                    if (!bl2) break block4;
                                    object = ((zzcm)object).zzb;
                                    object2 = (Integer)object2;
                                    int n3 = (Integer)object2;
                                    string2.putInt((String)object, n3);
                                    break block5;
                                }
                                bl2 = object2 instanceof Long;
                                if (!bl2) break block6;
                                object = ((zzcm)object).zzb;
                                object2 = (Long)object2;
                                long l2 = (Long)object2;
                                string2.putLong((String)object, l2);
                                break block5;
                            }
                            bl2 = object2 instanceof Double;
                            if (!bl2) break block7;
                            object = ((zzcm)object).zzb;
                            object2 = (Double)object2;
                            float f5 = ((Double)object2).floatValue();
                            string2.putFloat((String)object, f5);
                            break block5;
                        }
                        bl2 = object2 instanceof Float;
                        if (!bl2) break block8;
                        object = ((zzcm)object).zzb;
                        object2 = (Float)object2;
                        float f6 = ((Float)object2).floatValue();
                        string2.putFloat((String)object, f6);
                        break block5;
                    }
                    bl2 = object2 instanceof Boolean;
                    if (!bl2) break block9;
                    object = ((zzcm)object).zzb;
                    object2 = (Boolean)object2;
                    boolean bl3 = (Boolean)object2;
                    string2.putBoolean((String)object, bl3);
                    break block5;
                }
                bl2 = object2 instanceof String;
                if (!bl2) break block10;
                object = ((zzcm)object).zzb;
                object2 = (String)object2;
                string2.putString((String)object, (String)object2);
            }
            return true;
        }
        return false;
    }
}

