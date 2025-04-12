/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.os.CountDownTimer
 */
package com.jio.jioads.videomodule;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.CountDownTimer;
import com.jio.jioads.adinterfaces.JioAdView$AD_TYPE;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.instream.video.a;
import com.jio.jioads.videomodule.renderer.e;
import com.jio.jioads.videomodule.renderer.f;
import com.jio.jioads.videomodule.s;
import kotlin.text.StringsKt;
import kotlin.text.b;

public final class T
extends CountDownTimer {
    public final /* synthetic */ s a;

    public T(s s7, long l2) {
        this.a = s7;
        super(l2, 1000L);
    }

    public final void onFinish() {
        float f5;
        int n3;
        int n4;
        Object[] objectArray;
        int n7;
        Object object;
        boolean bl2;
        Object object2;
        int n8;
        Object object3 = this.a;
        object3.getClass();
        Object object4 = object3.d.K();
        JioAdView$AD_TYPE jioAdView$AD_TYPE = JioAdView$AD_TYPE.INTERSTITIAL;
        boolean bl3 = true;
        int n10 = 0;
        if (object4 == jioAdView$AD_TYPE) {
            object4 = object3.y;
            if (object4 != null && (jioAdView$AD_TYPE = ((f)object4).C) != null) {
                object4 = ((f)object4).y;
                if (object4 != null) {
                    object4 = (Drawable)tp_2.E(0, (Object[])object4);
                } else {
                    n8 = 0;
                    object4 = null;
                }
                object2 = object3.y;
                if (object2 != null && (object2 = object2.y) != null) {
                    object2 = (Drawable)tp_2.E((int)(bl3 ? 1 : 0), object2);
                } else {
                    bl2 = false;
                    object2 = null;
                }
                object = object3.y;
                if (object != null && (object = object.y) != null) {
                    n7 = 2;
                    object = (Drawable)tp_2.E(n7, (Object[])object);
                } else {
                    object = null;
                }
                objectArray = object3.y;
                if (objectArray != null && (objectArray = objectArray.y) != null) {
                    n4 = 3;
                    objectArray = (Drawable)tp_2.E(n4, objectArray);
                } else {
                    n7 = 0;
                    objectArray = null;
                }
                jioAdView$AD_TYPE.setCompoundDrawablesWithIntrinsicBounds((Drawable)object4, (Drawable)object2, (Drawable)object, (Drawable)objectArray);
            }
            if ((object4 = object3.y) != null) {
                object4 = ((f)object4).C;
            } else {
                n8 = 0;
                object4 = null;
            }
            n3 = 1065353216;
            f5 = 1.0f;
            if (object4 != null) {
                object4.setAlpha(f5);
            }
            object4 = object3.y;
            if (object4 != null) {
                object4 = ((f)object4).w;
            } else {
                n8 = 0;
                object4 = null;
            }
            if (object4 != null) {
                object4.setAlpha(f5);
            }
        }
        if ((object4 = object3.y) != null && (object4 = ((f)object4).C) != null) {
            object4.invalidate();
        }
        object4 = object3.e0;
        n3 = 1000;
        f5 = 1.401E-42f;
        if (object4 != null) {
            long l2;
            bl2 = object3.d();
            if (bl2 && (object2 = object3.y) != null && (bl2 = object2.c()) == bl3) {
                bl2 = true;
            } else {
                bl2 = false;
                object2 = null;
            }
            object = object3.R;
            objectArray = object3.X;
            if (objectArray != null) {
                n7 = objectArray.getDuration();
                l2 = n7;
            } else {
                l2 = 0L;
            }
            long l3 = n3;
            objectArray = l2 /= l3;
            ((e)object4).m(bl2, (String)object, (Long)objectArray);
        }
        object3.S = 0;
        object4 = object3.Z;
        if (object4 != null) {
            object4.cancel();
        }
        object3.Z = null;
        object2 = object3.z;
        if (object2 != null) {
            object4 = object3.T();
            if (object4 == null) {
                object4 = "";
            }
            object = object4;
            n8 = object3.P;
            n7 = n8 + 1;
            object4 = object3.X;
            n4 = object4 != null ? (n8 = object4.getCurrentPosition() / n3) : 0;
            object4 = object3.X;
            int n14 = object4 != null ? (n8 = object4.getDuration() / n3) : 0;
            object4 = object3.V;
            if (object4 != null) {
                long l4 = (Long)object4;
                n10 = (int)l4;
            }
            Integer n15 = n10;
            object2.onAdSkippable((String)object, n7, n4, n14, n15);
        }
        object3.a0 = bl3;
        com.jio.jioads.instream.video.a.a(object3, ": SkipTimer: onFinish");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object3 = JioAds$LogLevel.NONE;
    }

    public final void onTick(long l2) {
        block46: {
            block41: {
                int n3;
                s s7;
                block42: {
                    Object object;
                    Drawable drawable2;
                    Object[] objectArray;
                    f f5;
                    int n4;
                    JioAdView$AD_TYPE jioAdView$AD_TYPE;
                    int n7;
                    Object object2;
                    block44: {
                        String string2;
                        block45: {
                            String string3;
                            int n8;
                            int n10;
                            block43: {
                                int n14;
                                f f6;
                                long l3;
                                float f7;
                                int n15;
                                s7 = this.a;
                                object2 = s7.X;
                                if (object2 == null || (n15 = object2.isPlaying()) != (n10 = 1)) break block41;
                                object2 = s7.y;
                                if (object2 != null) {
                                    object2 = object2.C;
                                } else {
                                    n15 = 0;
                                    object2 = null;
                                }
                                n7 = 0;
                                if (object2 != null) {
                                    object2.setFocusable(false);
                                }
                                object2 = s7.y;
                                if (object2 != null) {
                                    object2 = object2.w;
                                } else {
                                    n15 = 0;
                                    object2 = null;
                                }
                                if (object2 != null) {
                                    object2.setFocusable(false);
                                }
                                object2 = s7.d.K();
                                jioAdView$AD_TYPE = JioAdView$AD_TYPE.INTERSTITIAL;
                                if (object2 == jioAdView$AD_TYPE) {
                                    object2 = s7.y;
                                    if (object2 != null) {
                                        object2 = object2.C;
                                    } else {
                                        n15 = 0;
                                        object2 = null;
                                    }
                                    n4 = 0x3F000000;
                                    f7 = 0.5f;
                                    if (object2 != null) {
                                        object2.setAlpha(f7);
                                    }
                                    object2 = s7.y;
                                    if (object2 != null) {
                                        object2 = object2.w;
                                    } else {
                                        n15 = 0;
                                        object2 = null;
                                    }
                                    if (object2 != null) {
                                        object2.setAlpha(f7);
                                    }
                                    object2 = s7.g;
                                    n15 = (int)(j_0.l((Context)object2) ? 1 : 0);
                                    n4 = 3;
                                    f7 = 4.2E-45f;
                                    if (n15 == 0 && (object2 = s7.y) != null && (f5 = object2.C) != null) {
                                        object2 = object2.y;
                                        if (object2 != null) {
                                            object2 = (Drawable)tp_2.E(n10, (Object[])object2);
                                        } else {
                                            n15 = 0;
                                            object2 = null;
                                        }
                                        objectArray = s7.y;
                                        if (objectArray != null && (objectArray = objectArray.y) != null) {
                                            l3 = 2;
                                            objectArray = (Drawable)tp_2.E((int)l3, objectArray);
                                        } else {
                                            objectArray = null;
                                        }
                                        drawable2 = s7.y;
                                        if (drawable2 != null && (drawable2 = drawable2.y) != null) {
                                            drawable2 = (Drawable)tp_2.E(n4, (Object[])drawable2);
                                        } else {
                                            l3 = 0;
                                            drawable2 = null;
                                        }
                                        f5.setCompoundDrawables(null, (Drawable)object2, (Drawable)objectArray, drawable2);
                                    }
                                    if ((n15 = (int)(j_0.l((Context)(object2 = s7.g)) ? 1 : 0)) != 0 && (object2 = s7.y) != null && (f5 = object2.C) != null) {
                                        object2 = object2.y;
                                        if (object2 != null) {
                                            object2 = (Drawable)tp_2.E(n10, (Object[])object2);
                                        } else {
                                            n15 = 0;
                                            object2 = null;
                                        }
                                        objectArray = s7.y;
                                        if (objectArray != null && (objectArray = objectArray.y) != null) {
                                            f6 = (Drawable)tp_2.E(n4, objectArray);
                                        } else {
                                            n4 = 0;
                                            f6 = null;
                                            f7 = 0.0f;
                                        }
                                        f5.setCompoundDrawables(null, (Drawable)object2, null, (Drawable)f6);
                                    }
                                }
                                if ((object2 = s7.y) != null && (object2 = object2.C) != null) {
                                    object2.invalidate();
                                }
                                n15 = 1000;
                                long l4 = n15;
                                l2 /= l4;
                                l4 = 1L;
                                l2 += l4;
                                object2 = s7.e0;
                                if (object2 == null) break block42;
                                n4 = (int)(s7.d() ? 1 : 0);
                                if (n4 != 0 && (f6 = s7.y) != null && (n4 = (int)(f6.c() ? 1 : 0)) == n10) {
                                    n4 = 1;
                                    f7 = Float.MIN_VALUE;
                                } else {
                                    n4 = 0;
                                    f7 = 0.0f;
                                    f6 = null;
                                }
                                long l7 = 0L;
                                l3 = l2 == l7 ? 0 : (l2 < l7 ? -1 : 1);
                                if (l3 <= 0) break block42;
                                f5 = object2.d;
                                objectArray = n4 != 0 ? f5.C : f5.w;
                                drawable2 = "SKIP_COUNTER";
                                if (n4 == 0) break block43;
                                String string4 = f5.B;
                                if (string4 != null && (n14 = StringsKt.F(string4, (CharSequence)drawable2, false)) == n10) {
                                    String string5 = f5.B;
                                    if (string5 != null) {
                                        object = String.valueOf(l2);
                                        object = b.n(string5, (String)drawable2, object, false);
                                    } else {
                                        n3 = 0;
                                        object = null;
                                    }
                                } else {
                                    object = f5.B;
                                }
                                break block44;
                            }
                            String string6 = f5.z;
                            string2 = "";
                            if (string6 == null || (n8 = StringsKt.F(string6, (CharSequence)drawable2, false)) != n10 || (string3 = f5.z) == null) break block45;
                            object = String.valueOf(l2);
                            if ((object = b.n(string3, (String)drawable2, object, false)) != null) break block44;
                        }
                        object = string2;
                    }
                    int n16 = 8;
                    if (objectArray != null) {
                        objectArray.setText((CharSequence)object);
                        objectArray.setFocusable(false);
                        object = f5.z;
                        if (object != null) {
                            n3 = (int)(StringsKt.F(object, (CharSequence)drawable2, false) ? 1 : 0);
                        } else {
                            n3 = 0;
                            object = null;
                        }
                        if (n3 == 0) {
                            n7 = 8;
                        }
                        objectArray.setVisibility(n7);
                    }
                    if ((object = f5.A) != null) {
                        object.setVisibility(n16);
                    }
                    object = f5.A;
                    if (object == null && n4 == 0 && (object = object2.a.K()) != jioAdView$AD_TYPE && (object = f5.w) != null) {
                        object.setCompoundDrawables(null, null, null, null);
                    }
                }
                s7.S = n3 = s7.S + -1;
                break block46;
            }
            this.cancel();
        }
    }
}

