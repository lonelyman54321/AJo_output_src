/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  android.util.AttributeSet
 */
package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.R$styleable;

public final class zzy {
    private final AdSize[] zza;
    private final String zzb;

    public zzy(Context object, AttributeSet object2) {
        boolean bl2;
        block7: {
            int n3;
            block6: {
                boolean bl3;
                Object object3;
                block5: {
                    object = object.getResources();
                    object3 = R$styleable.AdsAttrs;
                    object = object.obtainAttributes((AttributeSet)object2, object3);
                    n3 = R$styleable.AdsAttrs_adSize;
                    object2 = object.getString(n3);
                    int n4 = R$styleable.AdsAttrs_adSizes;
                    object3 = object.getString(n4);
                    bl2 = TextUtils.isEmpty((CharSequence)object2) ^ true;
                    bl3 = TextUtils.isEmpty((CharSequence)object3) ^ true;
                    if (!bl2 || bl3) break block5;
                    object2 = zzy.zzc((String)object2);
                    this.zza = object2;
                    break block6;
                }
                if (bl2 || !bl3) break block7;
                object2 = zzy.zzc((String)object3);
                this.zza = object2;
            }
            n3 = R$styleable.AdsAttrs_adUnitId;
            this.zzb = object2 = object.getString(n3);
            object.recycle();
            boolean bl4 = TextUtils.isEmpty((CharSequence)object2);
            if (!bl4) {
                return;
            }
            super("Required XML attribute \"adUnitId\" was missing.");
            throw object;
        }
        if (bl2) {
            object.recycle();
            super("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
            throw object;
        }
        object.recycle();
        super("Required XML attribute \"adSize\" was missing.");
        throw object;
    }

    private static AdSize[] zzc(String object) {
        Object object2;
        AdSize[] adSizeArray;
        int n3;
        Object object3;
        block27: {
            Object object4;
            object3 = ((String)object).split("\\s*,\\s*");
            n3 = ((String[])object3).length;
            adSizeArray = new AdSize[n3];
            int n4 = 0;
            while (true) {
                block31: {
                    boolean bl2;
                    Object object5;
                    block30: {
                        int n7;
                        int n8;
                        int n10;
                        block29: {
                            Object object6;
                            Object object7;
                            block28: {
                                String string2;
                                n10 = ((String[])object3).length;
                                object2 = "Could not parse XML attribute \"adSize\": ";
                                if (n4 >= n10) break block27;
                                object4 = object3[n4].trim();
                                bl2 = ((String)object4).matches((String)(object5 = "^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$"));
                                if (!bl2) break block30;
                                object5 = ((String)object4).split("[xX]");
                                object5[0] = string2 = object5[0].trim();
                                n8 = 1;
                                object5[n8] = object7 = ((String)object5[n8]).trim();
                                object7 = "FULL_WIDTH";
                                try {
                                    object6 = object5[0];
                                }
                                catch (NumberFormatException numberFormatException) {
                                    object3 = ((String)object2).concat((String)object4);
                                    object = new IllegalArgumentException((String)object3);
                                    throw object;
                                }
                                n7 = ((String)object7).equals(object6);
                                if (n7 == 0) break block28;
                                n7 = -1;
                            }
                            object7 = object5[0];
                            n7 = Integer.parseInt((String)object7);
                            object6 = "AUTO_HEIGHT";
                            Object object8 = object5[n8];
                            boolean bl3 = ((String)object6).equals(object8);
                            if (!bl3) break block29;
                            n10 = -2;
                        }
                        object5 = object5[n8];
                        n10 = Integer.parseInt((String)object5);
                        adSizeArray[n4] = object2 = new AdSize(n7, n10);
                        break block31;
                    }
                    object5 = "BANNER";
                    bl2 = ((String)object5).equals(object4);
                    if (bl2) {
                        adSizeArray[n4] = object4 = AdSize.BANNER;
                    } else {
                        object5 = "LARGE_BANNER";
                        bl2 = ((String)object5).equals(object4);
                        if (bl2) {
                            adSizeArray[n4] = object4 = AdSize.LARGE_BANNER;
                        } else {
                            object5 = "FULL_BANNER";
                            bl2 = ((String)object5).equals(object4);
                            if (bl2) {
                                adSizeArray[n4] = object4 = AdSize.FULL_BANNER;
                            } else {
                                object5 = "LEADERBOARD";
                                bl2 = ((String)object5).equals(object4);
                                if (bl2) {
                                    adSizeArray[n4] = object4 = AdSize.LEADERBOARD;
                                } else {
                                    object5 = "MEDIUM_RECTANGLE";
                                    bl2 = ((String)object5).equals(object4);
                                    if (bl2) {
                                        adSizeArray[n4] = object4 = AdSize.MEDIUM_RECTANGLE;
                                    } else {
                                        object5 = "SMART_BANNER";
                                        bl2 = ((String)object5).equals(object4);
                                        if (bl2) {
                                            adSizeArray[n4] = object4 = AdSize.SMART_BANNER;
                                        } else {
                                            object5 = "WIDE_SKYSCRAPER";
                                            bl2 = ((String)object5).equals(object4);
                                            if (bl2) {
                                                adSizeArray[n4] = object4 = AdSize.WIDE_SKYSCRAPER;
                                            } else {
                                                object5 = "FLUID";
                                                bl2 = ((String)object5).equals(object4);
                                                if (bl2) {
                                                    adSizeArray[n4] = object4 = AdSize.FLUID;
                                                } else {
                                                    object5 = "ICON";
                                                    bl2 = ((String)object5).equals(object4);
                                                    if (!bl2) break;
                                                    adSizeArray[n4] = object4 = AdSize.zza;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                ++n4;
            }
            object3 = ((String)object2).concat((String)object4);
            object = new IllegalArgumentException((String)object3);
            throw object;
        }
        if (n3 != 0) {
            return adSizeArray;
        }
        object = ((String)object2).concat((String)object);
        object3 = new IllegalArgumentException((String)object);
        throw object3;
    }

    public final String zza() {
        return this.zzb;
    }

    public final AdSize[] zzb(boolean bl2) {
        boolean bl3;
        Object object;
        if (!bl2 && (bl2 = ((AdSize[])(object = this.zza)).length) != (bl3 = true)) {
            object = new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
            throw object;
        }
        return this.zza;
    }
}

