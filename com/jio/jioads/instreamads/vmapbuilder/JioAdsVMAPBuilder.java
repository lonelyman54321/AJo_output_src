/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.TextUtils
 *  org.json.JSONObject
 */
package com.jio.jioads.instreamads.vmapbuilder;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.jioads.adinterfaces.JioAdView$AD_TYPE;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.JioAdsMetadata;
import com.jio.jioads.adinterfaces.JioAdsMetadata$Builder;
import com.jio.jioads.adinterfaces.W;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.cdnlogging.d;
import com.jio.jioads.controller.o;
import com.jio.jioads.instreamads.vmapbuilder.JioAdsVMAPInfo;
import com.jio.jioads.instreamads.vmapbuilder.JioAdsVMAPListener;
import com.jio.jioads.instreamads.vmapbuilder.a;
import com.jio.jioads.instreamads.vmapbuilder.b;
import com.jio.jioads.instreamads.vmapbuilder.c;
import com.jio.jioads.instreamads.vmapbuilder.e;
import com.jio.jioads.instreamads.vmapbuilder.f;
import com.jio.jioads.jioreel.ssai.p;
import com.jio.jioads.util.Utility;
import com.jio.jioads.util.j;
import com.jio.jioads.util.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import org.json.JSONObject;

public final class JioAdsVMAPBuilder {
    public static final c Companion;
    public static final String END = "end";
    public static final String START = "start";
    public static final String VMAP_CREATION_FAILED = "VMAP creation failed";
    public StringBuffer a;
    public StringBuffer b;
    public StringBuffer c;
    public boolean d;
    public boolean e;
    public boolean f;
    public JioAdView g;
    public JioAdView h;
    public final HashMap i;
    public boolean j;
    public Context k;
    public String l;
    public String m;
    public JioAdsVMAPInfo n;
    public int o;
    public int p;
    public int q;

    static {
        c c2;
        Companion = c2 = new Object();
    }

    public JioAdsVMAPBuilder() {
        HashMap hashMap;
        this.i = hashMap = new HashMap();
    }

    public static String a(String object, int n3, boolean bl2) {
        Object object2 = new StringBuilder("isMultiAdEnabled from vmap: ");
        object2.append(bl2);
        object2.append(' ');
        Intrinsics.checkNotNullParameter(object2.toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        object2 = "";
        String string2 = null;
        if (bl2) {
            int n4;
            object = kotlin.text.b.n((String)object, "</VAST>", (String)object2, false);
            Object object3 = new String[]{"<Ad id="};
            int n7 = 6;
            int n8 = (object3 = StringsKt.a0((CharSequence)object, (String[])object3, false, 0, n7)).size();
            if (n8 > (n4 = 1)) {
                object3 = (CharSequence)object3.get(n4);
                Object object4 = new String[]{">"};
                int n10 = 2;
                object3 = StringsKt.Y((CharSequence)object3, object4, n4 != 0, n10);
                object4 = (String)object3.get(0);
                String string3 = ((Object)StringsKt.m0((CharSequence)object4)).toString();
                String string4 = "\"";
                string3 = kotlin.text.b.n(string3, string4, (String)object2, false);
                int n14 = object3.size();
                if (n14 > n4) {
                    int n15 = -1;
                    String string5 = "\">\n";
                    String string6 = "<Ad id= \"";
                    if (n3 == n15) {
                        object = Gn.a(string6, string3, string5);
                        String string7 = (String)object3.get(n4);
                        ((StringBuilder)object).append(string7);
                        object = ((StringBuilder)object).toString();
                    } else {
                        object = "sequence";
                        boolean bl3 = StringsKt.F((CharSequence)object4, (CharSequence)object, false);
                        if (bl3) {
                            object = new String[]{object};
                            if ((n7 = (object = StringsKt.a0((CharSequence)object4, (String[])object, false, 0, n7)).size()) > n4) {
                                object = kotlin.text.b.n(((Object)StringsKt.m0((String)object.get(0))).toString(), string4, (String)object2, false);
                                object2 = "\"  sequence=\"";
                                string2 = "\" >\n";
                                object = oe3_0.a(n3, string6, (String)object, (String)object2, string2);
                                String string8 = (String)object3.get(n4);
                                ((StringBuilder)object).append(string8);
                                object = ((StringBuilder)object).toString();
                            } else {
                                object = Gn.a(string6, string3, string5);
                                String string9 = (String)object3.get(n4);
                                ((StringBuilder)object).append(string9);
                                object = ((StringBuilder)object).toString();
                            }
                        } else {
                            object = oe3_0.a(n3, string6, string3, "\" sequence=\"", string5);
                            String string10 = (String)object3.get(n4);
                            ((StringBuilder)object).append(string10);
                            object = ((StringBuilder)object).toString();
                        }
                    }
                }
            }
        } else {
            String string11 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
            object = kotlin.text.b.n((String)object, string11, (String)object2, false);
        }
        return object;
    }

    public static final void a(JioAdsVMAPBuilder object, JioAdsVMAPListener jioAdsVMAPListener) {
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = "$vmapListener";
        Intrinsics.checkNotNullParameter(jioAdsVMAPListener, (String)object2);
        boolean bl2 = ((JioAdsVMAPBuilder)object).j;
        if (!bl2) {
            ((JioAdsVMAPBuilder)object).j = bl2 = true;
            object = com.jio.jioads.controller.o.U;
            if (object != null) {
                ((HashMap)object).clear();
            }
            object = null;
            com.jio.jioads.controller.o.U = null;
            object2 = com.jio.jioads.controller.o.T;
            if (object2 != null) {
                ((HashMap)object2).clear();
            }
            com.jio.jioads.controller.o.T = null;
            object = VMAP_CREATION_FAILED;
            jioAdsVMAPListener.onFailure((String)object);
        }
    }

    public static final void a(JioAdsVMAPBuilder object, JioAdsVMAPListener jioAdsVMAPListener, StringBuffer stringBuffer) {
        Intrinsics.checkNotNullParameter(object, "this$0");
        Intrinsics.checkNotNullParameter(jioAdsVMAPListener, "$vmapListener");
        Object object2 = "$finalVMAP";
        Intrinsics.checkNotNullParameter(stringBuffer, (String)object2);
        boolean bl2 = ((JioAdsVMAPBuilder)object).j;
        if (!bl2) {
            ((JioAdsVMAPBuilder)object).j = bl2 = true;
            object = com.jio.jioads.controller.o.U;
            if (object != null) {
                ((HashMap)object).clear();
            }
            object = null;
            com.jio.jioads.controller.o.U = null;
            object2 = com.jio.jioads.controller.o.T;
            if (object2 != null) {
                ((HashMap)object2).clear();
            }
            com.jio.jioads.controller.o.T = null;
            object = stringBuffer.toString();
            jioAdsVMAPListener.onSuccess((String)object);
        }
    }

    public static final StringBuffer access$generateADBreakTagForMidroll(JioAdsVMAPBuilder jioAdsVMAPBuilder, String string2, ArrayList arrayList, String string3, JioAdView jioAdView, boolean bl2) {
        Object object;
        String string4;
        Object object2;
        Object object3;
        int n3;
        boolean bl3;
        Object object4;
        Object object5 = arrayList;
        boolean bl4 = bl2;
        jioAdsVMAPBuilder.getClass();
        StringBuffer stringBuffer = new StringBuffer();
        String string5 = "";
        if (!bl2) {
            if (arrayList != null) {
                object4 = (String)CollectionsKt.firstOrNull(arrayList);
            } else {
                bl3 = false;
                object4 = null;
            }
            if (object4 != null) {
                boolean bl5;
                object5 = ((ArrayList)object5).get(0);
                Intrinsics.checkNotNullExpressionValue(object5, "get(...)");
                object5 = kotlin.text.b.n(kotlin.text.b.n(kotlin.text.b.n((String)object5, "\n", string5, false), "<?xml version=\"1.0\" encoding=\"UTF-8\"?><VAST version=\"3.0\">", string5, false), "</VAST>", string5, false);
                object4 = new String[]{"<Ad id="};
                n3 = 6;
                object5 = StringsKt.a0((CharSequence)object5, (String[])object4, false, 0, n3);
                object4 = new ArrayList();
                object5 = object5.iterator();
                while (bl5 = object5.hasNext()) {
                    object3 = (String)object5.next();
                    object2 = new String[]{">"};
                    int n4 = 2;
                    int n7 = 1;
                    object3 = StringsKt.Y((CharSequence)object3, (String[])object2, n7 != 0, n4);
                    object2 = (String)object3.get(0);
                    string4 = ((Object)StringsKt.m0((CharSequence)object2)).toString();
                    String string6 = "\"";
                    string4 = kotlin.text.b.n(string4, string6, string5, false);
                    int n8 = object3.size();
                    if (n8 <= n7) continue;
                    String[] stringArray = "sequence";
                    boolean bl6 = StringsKt.F((CharSequence)object2, (CharSequence)stringArray, false);
                    String string7 = "\">\n";
                    object = "<Ad id= \"";
                    if (bl6) {
                        n8 = (object2 = StringsKt.a0((CharSequence)object2, stringArray = new String[]{stringArray}, false, 0, n3)).size();
                        if (n8 > n7) {
                            object2 = kotlin.text.b.n(((Object)StringsKt.m0((String)object2.get(0))).toString(), string6, string5, false);
                            string4 = "\" >\n";
                            object = Gn.a((String)object, (String)object2, string4);
                            object3 = (String)object3.get(n7);
                            ((StringBuilder)object).append((String)object3);
                            object = ((StringBuilder)object).toString();
                        } else {
                            object = Gn.a((String)object, string4, string7);
                            object3 = (String)object3.get(n7);
                            ((StringBuilder)object).append((String)object3);
                            object = ((StringBuilder)object).toString();
                        }
                    } else {
                        object = Gn.a((String)object, string4, string7);
                        object3 = (String)object3.get(n7);
                        ((StringBuilder)object).append((String)object3);
                        object = ((StringBuilder)object).toString();
                    }
                    ((ArrayList)object4).add(object);
                }
                object5 = object4;
            } else {
                object5 = null;
            }
        }
        if (object5 != null) {
            object5 = object5.iterator();
            int n10 = 0;
            object = null;
            while (bl3 = object5.hasNext()) {
                object4 = object5.next();
                n3 = n10 + 1;
                if (n10 >= 0) {
                    int n14;
                    if (jioAdView != null && (object = jioAdView.getIjioAdView$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) != null) {
                        block21: {
                            object3 = new Object();
                            object2 = object.Y();
                            ((k)object3).p = object2;
                            object2 = object.P();
                            ((k)object3).q = object2;
                            ((k)object3).a = object4;
                            object4 = Utility.INSTANCE;
                            object2 = object.P();
                            object2 = ((Utility)object4).getCcbValue((String)object2);
                            ((k)object3).b = object2;
                            object2 = object.Y();
                            if (object2 != null) {
                                Intrinsics.checkNotNullParameter(object2, "context");
                                string4 = "common_prefs";
                                String string8 = "advid";
                                try {
                                    object2 = j_0.d((Context)object2, string4, 0, string5, string8);
                                    string4 = "null cannot be cast to non-null type kotlin.String";
                                }
                                catch (Exception exception) {}
                                Intrinsics.checkNotNull(object2, string4);
                                object2 = (String)object2;
                                break block21;
                            }
                            n14 = 0;
                            object2 = null;
                        }
                        ((k)object3).r = object2;
                        object2 = object.Y();
                        object2 = ((Utility)object4).getUidFromPreferences((Context)object2);
                        ((k)object3).s = object2;
                        object2 = n3;
                        ((k)object3).l = object2;
                        object2 = object.q0();
                        ((k)object3).w = object2;
                        object2 = Boolean.TRUE;
                        ((k)object3).m = object2;
                        ((k)object3).o = object2;
                        object2 = Boolean.FALSE;
                        ((k)object3).n = object2;
                        object2 = object.R();
                        ((k)object3).t = object2;
                        object.L();
                        n14 = object.W();
                        object2 = n14;
                        ((k)object3).F = object2;
                        object = object.K();
                        ((k)object3).u = object;
                        object = ((Utility)object4).replaceMacros((k)object3);
                    } else {
                        n10 = 0;
                        object = null;
                    }
                    object4 = new StringBuilder("<vmap:AdBreak breakType=\"linear\" timeOffset= \"");
                    object3 = string2;
                    ((StringBuilder)object4).append(string2);
                    object2 = "\">\n      <vmap:AdSource>\n         <vmap:VASTAdData>\n            <VAST version=\"3.0\">\n";
                    ((StringBuilder)object4).append((String)object2);
                    object4 = ((StringBuilder)object4).toString();
                    stringBuffer.append((String)object4);
                    object4 = "append(...)";
                    Intrinsics.checkNotNullExpressionValue(stringBuffer, (String)object4);
                    if (object != null) {
                        n14 = -1;
                        object = JioAdsVMAPBuilder.a((String)object, n14, bl4);
                    } else {
                        n10 = 0;
                        object = null;
                    }
                    stringBuffer.append((String)object);
                    Intrinsics.checkNotNullExpressionValue(stringBuffer, (String)object4);
                    object = "</VAST>\n         </vmap:VASTAdData>\n      </vmap:AdSource>\n   </vmap:AdBreak>\n";
                    stringBuffer.append((String)object);
                    Intrinsics.checkNotNullExpressionValue(stringBuffer, (String)object4);
                    n10 = n3;
                    continue;
                }
                xx_2.n();
                throw null;
            }
        }
        return stringBuffer;
    }

    public static final StringBuffer access$generateADBreakTagForPrePostRoll(JioAdsVMAPBuilder object, String string2, ArrayList iterator, String object2, com.jio.jioads.common.b b2, boolean bl2) {
        object.getClass();
        object = new StringBuffer();
        object2 = b2.k0();
        Object object3 = JioAdView$AdState.DESTROYED;
        if (object2 != object3) {
            object2 = b2.Y();
            object3 = new StringBuffer();
            if (iterator != null) {
                boolean bl3;
                iterator = iterator.iterator();
                int n3 = 0;
                Object object4 = null;
                while (bl3 = iterator.hasNext()) {
                    Object object5 = iterator.next();
                    int n4 = n3 + 1;
                    String string3 = null;
                    if (n3 >= 0) {
                        int n7;
                        Object object6;
                        block11: {
                            object5 = (String)object5;
                            object4 = new Object();
                            ((k)object4).p = object2;
                            object6 = b2.P();
                            ((k)object4).q = object6;
                            ((k)object4).a = object5;
                            object5 = Utility.INSTANCE;
                            object6 = b2.P();
                            object6 = ((Utility)object5).getCcbValue((String)object6);
                            ((k)object4).b = object6;
                            if (object2 != null) {
                                Intrinsics.checkNotNullParameter(object2, "context");
                                object6 = "common_prefs";
                                String string4 = "advid";
                                String string5 = "";
                                try {
                                    object6 = j_0.d((Context)object2, (String)object6, 0, string5, string4);
                                    string4 = "null cannot be cast to non-null type kotlin.String";
                                }
                                catch (Exception exception) {}
                                Intrinsics.checkNotNull(object6, string4);
                                object6 = (String)object6;
                                break block11;
                            }
                            n7 = 0;
                            object6 = null;
                        }
                        ((k)object4).r = object6;
                        object6 = ((Utility)object5).getUidFromPreferences((Context)object2);
                        ((k)object4).s = object6;
                        ((k)object4).l = object6 = Integer.valueOf(n4);
                        ((k)object4).t = object6 = b2.R();
                        ((k)object4).w = object6 = b2.q0();
                        ((k)object4).m = object6 = Boolean.TRUE;
                        ((k)object4).o = object6;
                        ((k)object4).n = object6 = Boolean.FALSE;
                        b2.L();
                        n7 = b2.W();
                        ((k)object4).F = object6 = Integer.valueOf(n7);
                        object6 = b2.K();
                        ((k)object4).u = object6;
                        object4 = ((Utility)object5).replaceMacros((k)object4);
                        if (object4 != null) {
                            string3 = JioAdsVMAPBuilder.a((String)object4, n4, bl2);
                        }
                        ((StringBuffer)object3).append(string3);
                        n3 = n4;
                        continue;
                    }
                    xx_2.n();
                    throw null;
                }
            }
            iterator = "<vmap:AdBreak breakType=\"linear\" timeOffset= \"";
            if (bl2) {
                object2 = "\">\n      <vmap:AdSource>\n         <vmap:VASTAdData>\n            <VAST version=\"3.0\">\n";
                string2 = cP.a(iterator, string2, object2);
            } else {
                object2 = "\">\n      <vmap:AdSource>\n         <vmap:VASTAdData>\n";
                string2 = cP.a(iterator, string2, object2);
            }
            ((StringBuffer)object).append(string2);
            ((StringBuffer)object).append((StringBuffer)object3);
            string2 = bl2 ? "</VAST>\n         </vmap:VASTAdData>\n      </vmap:AdSource>\n   </vmap:AdBreak>\n" : " </vmap:VASTAdData>\n      </vmap:AdSource>\n   </vmap:AdBreak>\n";
            ((StringBuffer)object).append(string2);
        }
        return object;
    }

    public static final /* synthetic */ void access$generateVMAP(JioAdsVMAPBuilder jioAdsVMAPBuilder, JioAdsVMAPListener jioAdsVMAPListener, boolean bl2) {
        jioAdsVMAPBuilder.a(jioAdsVMAPListener, bl2);
    }

    public static final String access$getFormattedTime(JioAdsVMAPBuilder object, int n3) {
        int n4 = 1;
        int n7 = 3;
        int n8 = 2;
        object.getClass();
        int n10 = 60;
        int n14 = n3 % 60;
        String string2 = "format(format, *args)";
        if ((n3 /= n10) >= n10) {
            int n15 = n3 / 60;
            object = StringCompanionObject.INSTANCE;
            object = n15;
            Integer n16 = n3 %= n10;
            Integer n17 = n14;
            Object[] objectArray = new Object[n7];
            objectArray[0] = object;
            objectArray[n4] = n16;
            objectArray[n8] = n17;
            object = xh2_0.a(objectArray, n7, "%02d:%02d:%02d", string2);
        } else {
            object = StringCompanionObject.INSTANCE;
            object = n3;
            Integer n18 = n14;
            Object[] objectArray = new Object[n8];
            objectArray[0] = object;
            objectArray[n4] = n18;
            object = xh2_0.a(objectArray, n8, "00:%02d:%02d", string2);
        }
        return object;
    }

    public static final /* synthetic */ StringBuffer access$getMidrollADBreak$p(JioAdsVMAPBuilder jioAdsVMAPBuilder) {
        return jioAdsVMAPBuilder.c;
    }

    public static final /* synthetic */ StringBuffer access$getPostrollADBreak$p(JioAdsVMAPBuilder jioAdsVMAPBuilder) {
        return jioAdsVMAPBuilder.b;
    }

    public static final /* synthetic */ JioAdView access$getPostrollJioAdView$p(JioAdsVMAPBuilder jioAdsVMAPBuilder) {
        return jioAdsVMAPBuilder.h;
    }

    public static final /* synthetic */ StringBuffer access$getPrerollADBreak$p(JioAdsVMAPBuilder jioAdsVMAPBuilder) {
        return jioAdsVMAPBuilder.a;
    }

    public static final /* synthetic */ JioAdView access$getPrerollJioAdView$p(JioAdsVMAPBuilder jioAdsVMAPBuilder) {
        return jioAdsVMAPBuilder.g;
    }

    public static final /* synthetic */ void access$setCurrMidrollAdSeq$p(JioAdsVMAPBuilder jioAdsVMAPBuilder, String string2) {
        jioAdsVMAPBuilder.m = string2;
    }

    public static final /* synthetic */ void access$setCurrPrerollAdSeq$p(JioAdsVMAPBuilder jioAdsVMAPBuilder, String string2) {
        jioAdsVMAPBuilder.l = string2;
    }

    public static final /* synthetic */ void access$setMidrollADBreak$p(JioAdsVMAPBuilder jioAdsVMAPBuilder, StringBuffer stringBuffer) {
        jioAdsVMAPBuilder.c = stringBuffer;
    }

    public static final /* synthetic */ void access$setMidrollSelectionCompleted$p(JioAdsVMAPBuilder jioAdsVMAPBuilder, boolean bl2) {
        jioAdsVMAPBuilder.d = bl2;
    }

    public static final /* synthetic */ void access$setPostrollADBreak$p(JioAdsVMAPBuilder jioAdsVMAPBuilder, StringBuffer stringBuffer) {
        jioAdsVMAPBuilder.b = stringBuffer;
    }

    public static final /* synthetic */ void access$setPostrollJioAdView$p(JioAdsVMAPBuilder jioAdsVMAPBuilder, JioAdView jioAdView) {
        jioAdsVMAPBuilder.h = jioAdView;
    }

    public static final /* synthetic */ void access$setPostrollSelectionCompleted$p(JioAdsVMAPBuilder jioAdsVMAPBuilder, boolean bl2) {
        jioAdsVMAPBuilder.f = bl2;
    }

    public static final /* synthetic */ void access$setPrerollADBreak$p(JioAdsVMAPBuilder jioAdsVMAPBuilder, StringBuffer stringBuffer) {
        jioAdsVMAPBuilder.a = stringBuffer;
    }

    public static final /* synthetic */ void access$setPrerollSelectionCompleted$p(JioAdsVMAPBuilder jioAdsVMAPBuilder, boolean bl2) {
        jioAdsVMAPBuilder.e = bl2;
    }

    public static final void b(JioAdsVMAPBuilder object, JioAdsVMAPListener jioAdsVMAPListener) {
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = "$vmapListener";
        Intrinsics.checkNotNullParameter(jioAdsVMAPListener, (String)object2);
        boolean bl2 = ((JioAdsVMAPBuilder)object).j;
        if (!bl2) {
            ((JioAdsVMAPBuilder)object).j = bl2 = true;
            object = com.jio.jioads.controller.o.U;
            if (object != null) {
                ((HashMap)object).clear();
            }
            object = null;
            com.jio.jioads.controller.o.U = null;
            object2 = com.jio.jioads.controller.o.T;
            if (object2 != null) {
                ((HashMap)object2).clear();
            }
            com.jio.jioads.controller.o.T = null;
            object = VMAP_CREATION_FAILED;
            jioAdsVMAPListener.onFailure((String)object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void a() {
        Object object;
        boolean bl2;
        JioAdView jioAdView = this.g;
        if (jioAdView != null) {
            jioAdView.onDestroy();
        }
        jioAdView = null;
        this.g = null;
        Object object2 = this.i;
        // MONITORENTER : object2
        Object object3 = this.i;
        object3 = object3.entrySet();
        object3 = object3.iterator();
        while (bl2 = object3.hasNext()) {
            object = object3.next();
            object = (Map.Entry)object;
            Object object4 = "destroying midroll jiodview";
            String string2 = "message";
            Intrinsics.checkNotNullParameter(object4, string2);
            object4 = JioAds.Companion;
            object4 = ((JioAds$Companion)object4).getInstance();
            ((JioAds)object4).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object4 = JioAds$LogLevel.NONE;
            object = object.getValue();
            if ((object = (JioAdView)object) == null) continue;
            ((JioAdView)object).onDestroy();
        }
        object3 = Unit.a;
        // MONITOREXIT : object2
        object2 = this.i;
        // MONITORENTER : object2
        object3 = this.i;
        boolean bl3 = object3.isEmpty() ^ true;
        if (bl3) {
            object3 = "clearing midroll jiodview";
            object = "message";
            Intrinsics.checkNotNullParameter(object3, object);
            object3 = JioAds.Companion;
            object3 = ((JioAds$Companion)object3).getInstance();
            ((JioAds)object3).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object3 = JioAds$LogLevel.NONE;
            object3 = this.i;
            ((HashMap)object3).clear();
        }
        object2 = this.h;
        if (object2 != null) {
            ((JioAdView)object2).onDestroy();
        }
        this.h = null;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(JioAdsVMAPListener object, boolean bl2) {
        boolean bl3;
        CharSequence charSequence;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        block11: {
            int n3;
            long l2;
            object5 = "Final Vmap:";
            object4 = "VMAP document completed: Total time taken: ";
            try {
                object3 = new StringBuffer();
                boolean bl4 = this.d;
                if (!bl4) return;
                bl4 = this.e;
                if (!bl4) return;
                bl4 = this.f;
                if (!bl4) return;
                object2 = "Inside generation of  VMAP document";
                com.jio.jioads.util.j.a((String)object2);
                l2 = System.currentTimeMillis();
                charSequence = this.a;
                bl3 = TextUtils.isEmpty((CharSequence)charSequence);
                if (bl3 && (bl3 = TextUtils.isEmpty((CharSequence)(charSequence = this.c))) && (bl3 = TextUtils.isEmpty((CharSequence)(charSequence = this.b)))) {
                    object5 = "All adbreak is empty";
                    com.jio.jioads.util.j.a((String)object5);
                    object4 = Looper.getMainLooper();
                    object5 = new Handler((Looper)object4);
                    object4 = new a(this, (JioAdsVMAPListener)object);
                    object5.post((Runnable)object4);
                    this.a();
                    return;
                }
            }
            catch (Exception exception) {
                break block11;
            }
            charSequence = "<vmap:VMAP xmlns:vmap=\"http://www.iab.net/videosuite/vmap\" version=\"1.0\">\n";
            {
                ((StringBuffer)object3).append((String)charSequence);
                charSequence = this.a;
                bl3 = TextUtils.isEmpty((CharSequence)charSequence);
                if (!bl3) {
                    charSequence = this.a;
                    ((StringBuffer)object3).append((StringBuffer)charSequence);
                } else {
                    charSequence = new StringBuffer();
                    this.a = charSequence;
                }
                charSequence = this.c;
                bl3 = TextUtils.isEmpty((CharSequence)charSequence);
                if (!bl3) {
                    charSequence = this.c;
                    ((StringBuffer)object3).append((StringBuffer)charSequence);
                } else {
                    charSequence = new StringBuffer();
                    this.c = charSequence;
                }
                charSequence = this.b;
                bl3 = TextUtils.isEmpty((CharSequence)charSequence);
                if (!bl3) {
                    charSequence = this.b;
                    ((StringBuffer)object3).append((StringBuffer)charSequence);
                } else {
                    charSequence = new StringBuffer();
                    this.b = charSequence;
                }
                charSequence = "</vmap:VMAP>\n";
                ((StringBuffer)object3).append((String)charSequence);
                charSequence = new StringBuilder((String)object4);
                long l3 = System.currentTimeMillis() - l2;
                n3 = 100;
            }
            l2 = n3;
            {
                ((StringBuilder)charSequence).append(l3 /= l2);
                object4 = " MS";
                ((StringBuilder)charSequence).append((String)object4);
                object4 = ((StringBuilder)charSequence).toString();
                com.jio.jioads.util.j.a((String)object4);
                object2 = Looper.getMainLooper();
                object4 = new Handler((Looper)object2);
                int n4 = 1;
                object2 = new ov1_1(this, n4, object, object3);
                object4.post((Runnable)object2);
                this.a();
                object = new StringBuilder((String)object5);
                ((StringBuilder)object).append(object3);
                object = ((StringBuilder)object).toString();
                com.jio.jioads.util.j.d((String)object);
                return;
            }
        }
        object4 = this.k;
        if (object4 == null) return;
        object5 = Utility.INSTANCE;
        object2 = com.jio.jioads.cdnlogging.d.a;
        object = JioAdError$JioAdErrorType.ERROR_IN_VMAP_BUILDER;
        String string2 = ((JioAdError$JioAdErrorType)((Object)object)).getErrorTitle();
        object3 = com.jio.jioads.jioreel.ssai.p.t;
        bl3 = false;
        charSequence = null;
        Object object6 = object3 != null ? (object3 = new com.jio.jioads.cdnlogging.a()) : null;
        Boolean bl5 = bl2;
        Object object7 = this.k;
        Object object8 = object7 != null ? (object7 = object7.getPackageName()) : null;
        String string3 = ((JioAdError$JioAdErrorType)((Object)object)).getErrorCode();
        object3 = "";
        charSequence = "Exception while generation of  VMAP document";
        String string4 = "JioAdsVMAPBuilder-getVMAPData";
        ((Utility)object5).logError((Context)object4, (String)object3, (d)((Object)object2), string2, (String)charSequence, (com.jio.jioads.cdnlogging.a)object6, string4, bl5, (String)object8, string3, false);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void a(String var1_1, String var2_2) {
        block38: {
            var3_3 = "ad_seq_and_blk_pref";
            var4_4 = "sl";
            var5_5 = "sh";
            var6_6 = "adspotSequenceLocal_";
            var7_7 = new StringBuilder("Inside increment AdSeq for ");
            var7_7.append(var2_2);
            var7_7.append(" : ");
            var7_7.append((String)var1_1);
            var7_7 = var7_7.toString();
            var8_8 = "message";
            Intrinsics.checkNotNullParameter(var7_7, var8_8);
            var7_7 = JioAds.Companion;
            var7_7.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            var9_9 = JioAds$LogLevel.NONE;
            try {
                var9_9 = new JSONObject((String)var1_1);
            }
            catch (Exception v0) {
                ** continue;
            }
            var10_10 = var9_9.optInt((String)var4_4);
            var11_11 = var9_9.optInt((String)var5_5);
            var12_12 /* !! */  = this.k;
            Intrinsics.checkNotNull(var12_12 /* !! */ );
            var13_13 /* !! */  = new StringBuilder(var6_6);
            var13_13 /* !! */ .append(var2_2);
            var13_13 /* !! */  = var13_13 /* !! */ .toString();
            var14_14 = "";
            var12_12 /* !! */  = j_0.d(var12_12 /* !! */ , var3_3, 0, var14_14, (String)var13_13 /* !! */ );
            var13_13 /* !! */  = "null cannot be cast to non-null type kotlin.String";
            Intrinsics.checkNotNull(var12_12 /* !! */ , (String)var13_13 /* !! */ );
            var12_12 /* !! */  = (String)var12_12 /* !! */ ;
            var15_15 = TextUtils.isEmpty((CharSequence)var12_12 /* !! */ );
            if (!var15_15) break block38;
            var12_12 /* !! */  = "{\"sl\":0,\"sk\":0,\"sh\":0,\"ad-request-cycle-completed\":false}";
        }
        var13_13 /* !! */  = new JSONObject((String)var12_12 /* !! */ );
        var16_16 = var13_13 /* !! */ .optInt((String)var5_5) + 1;
        var13_13 /* !! */ .put((String)var5_5, var16_16);
        var5_5 = new StringBuilder();
        var5_5.append(var2_2);
        var14_14 = ": localShowCount= ";
        var5_5.append(var14_14);
        var5_5.append(var16_16);
        var14_14 = " and headerShowCount= ";
        var5_5.append(var14_14);
        var5_5.append(var11_11);
        var5_5 = var5_5.toString();
        Intrinsics.checkNotNullParameter(var5_5, var8_8);
        var5_5 = var7_7.getInstance();
        var5_5.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        if (var11_11 <= 0 || var16_16 != var11_11 || var10_10 <= 0) ** GOTO lbl91
        var17_17 = System.currentTimeMillis();
        var19_18 = 60000;
        var20_19 = var10_10 *= var19_18;
        var17_17 += var20_19;
        var13_13 /* !! */ .put((String)var4_4, var17_17);
lbl91:
        // 2 sources

        var1_1 = this.k;
        Intrinsics.checkNotNull(var1_1);
        var4_4 = new StringBuilder(var6_6);
        var4_4.append(var2_2);
        var4_4 = var4_4.toString();
        var5_5 = var13_13 /* !! */ .toString();
        j_0.p((Context)var1_1, var3_3, 0, var5_5, (String)var4_4);
        var1_1 = new StringBuilder();
        var1_1.append(var2_2);
        var2_2 = ": local Ad sequence value after increment ";
        var1_1.append(var2_2);
        var1_1.append((Object)var13_13 /* !! */ );
        var1_1 = var1_1.toString();
        Intrinsics.checkNotNullParameter(var1_1, var8_8);
        var1_1 = var7_7.getInstance();
        var1_1.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
lbl123:
        // 2 sources

    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void destroyVMAP() {
        Intrinsics.checkNotNullParameter("Inside destroyVMAP", "message");
        Object object = JioAds.Companion;
        ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
        jioAds$LogLevel = null;
        this.k = null;
        this.a = null;
        this.b = null;
        this.c = null;
        this.l = null;
        this.m = null;
        Object object2 = this.g;
        if (object2 != null) {
            ((JioAdView)object2).onDestroy();
        }
        this.g = null;
        object2 = this.h;
        if (object2 != null) {
            ((JioAdView)object2).onDestroy();
        }
        this.h = null;
        boolean bl2 = false;
        this.e = false;
        this.d = false;
        this.f = false;
        this.j = false;
        object2 = new StringBuilder("midrollJioAdViewSize :");
        int n3 = this.i.size();
        ((StringBuilder)object2).append(n3);
        object2 = ((StringBuilder)object2).toString();
        Object object3 = "message";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = this.i;
        // MONITORENTER : object
        object2 = this.i;
        object2 = ((HashMap)object2).entrySet();
        object2 = object2.iterator();
        while ((n3 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
            object3 = object2.next();
            object3 = (Map.Entry)object3;
            Object object4 = "destroying midroll jiodview";
            String string2 = "message";
            Intrinsics.checkNotNullParameter(object4, string2);
            object4 = JioAds.Companion;
            object4 = ((JioAds$Companion)object4).getInstance();
            ((JioAds)object4).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object4 = JioAds$LogLevel.NONE;
            object3 = object3.getValue();
            if ((object3 = (JioAdView)object3) == null) continue;
            ((JioAdView)object3).onDestroy();
        }
        object2 = Unit.a;
        // MONITOREXIT : object
        object = this.i;
        // MONITORENTER : object
        object2 = this.i;
        bl2 = ((HashMap)object2).isEmpty() ^ true;
        if (bl2) {
            object2 = "clearing midroll jiodview";
            object3 = "message";
            Intrinsics.checkNotNullParameter(object2, (String)object3);
            object2 = JioAds.Companion;
            object2 = ((JioAds$Companion)object2).getInstance();
            ((JioAds)object2).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
            object2 = this.i;
            ((HashMap)object2).clear();
        }
        this.n = null;
    }

    public final int getMidRollAdSelectionFailedCount$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        return this.o;
    }

    public final int getPostRollAdSelectionFailedCount$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        return this.q;
    }

    public final int getPreRollAdSelectionFailedCount$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        return this.p;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void getVMAPData(Context var1_1, JioAdsVMAPInfo var2_2, JioAdsVMAPListener var3_3) {
        block44: {
            block43: {
                block42: {
                    var4_4 = this;
                    var5_5 = var1_1;
                    var6_6 = var3_3;
                    var7_7 = "message";
                    Intrinsics.checkNotNullParameter(var1_1, "context");
                    Intrinsics.checkNotNullParameter(var2_2, "adInfo");
                    var8_8 = "vmapListener";
                    Intrinsics.checkNotNullParameter(var3_3, (String)var8_8);
                    var9_9 /* !! */  = null;
                    try {
                        this.k = var1_1;
                        this.n = var2_2;
                        var8_8 = var2_2.getPreRollAdspot();
                        var10_10 = TextUtils.isEmpty((CharSequence)var8_8);
                        var11_11 = "Inside setting metamap in vmap builder";
                        var12_12 /* !! */  = "";
                        var13_13 = true;
                        if (!var10_10) {
                            var8_8 = "Inside Pre-roll fetching in vmap builder";
                            Intrinsics.checkNotNullParameter(var8_8, (String)var7_7);
                            var8_8 = JioAds.Companion;
                            var14_14 = var8_8.getInstance();
                            var14_14.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            var14_14 = JioAds$LogLevel.NONE;
                            var15_15 = System.currentTimeMillis();
                            var17_16 = var2_2.getPreRollAdspot();
                            if (var17_16 == null) {
                                var17_16 = var12_12 /* !! */ ;
                            }
                            var18_17 = JioAdView$AD_TYPE.INSTREAM_VIDEO;
                            var4_4.g = var14_14 = new JioAdView(var5_5, (String)var17_16, (JioAdView$AD_TYPE)var18_17);
                            var14_14 = var2_2.getMetadata();
                            if (var14_14 == null) break block42;
                            var14_14 = var14_14.getAdMetadata$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var5_5);
                            break block43;
                        }
                        ** GOTO lbl72
                    }
                    catch (Exception v0) {
                        var10_10 = false;
                        var8_8 = null;
                        break block44;
                    }
                }
                var19_19 = false;
                var14_14 = null;
            }
            if (var14_14 == null) ** GOTO lbl63
            {
                block46: {
                    Intrinsics.checkNotNullParameter(var11_11, (String)var7_7);
                    var8_8 = var8_8.getInstance();
                    var8_8.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    var8_8 = var4_4.g;
                    if (var8_8 != null) {
                        var14_14 = new JioAdsMetadata$Builder();
                        var17_16 = var2_2.getMetadata();
                        if (var17_16 != null) {
                            var18_17 = var4_4.g;
                            var18_17 = var18_17 != null && (var18_17 = var18_17.getIjioAdView$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) != null ? var18_17.Y() : null;
                            var17_16 = var17_16.getAdMetadata$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((Context)var18_17);
                        } else {
                            var17_16 = null;
                        }
                        var14_14 = var14_14.setCustomMetadata((Map)var17_16);
                        var14_14 = var14_14.build();
                        var8_8.setMetaData$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((JioAdsMetadata)var14_14);
                    }
lbl63:
                    // 4 sources

                    if ((var20_20 = var4_4.g) != null) {
                        var8_8 = var18_17;
                        var14_14 = var2_2;
                        var17_16 = this;
                        var21_18 /* !! */  = var18_17;
                        var18_17 = var3_3;
                        var8_8(var2_2, var15_15, this, var3_3);
                        var20_20.getAds$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((W)var8_8, null);
                    }
                    break block46;
lbl72:
                    // 1 sources

                    var8_8 = "Pre-roll not available";
                    Intrinsics.checkNotNullParameter(var8_8, (String)var7_7);
                    var8_8 = JioAds.Companion;
                    var8_8 = var8_8.getInstance();
                    var8_8.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    var8_8 = JioAds$LogLevel.NONE;
                    this.e = var13_13;
                    var10_10 = false;
                    var8_8 = null;
                    this.a(var3_3, false);
                }
                if ((var10_10 = TextUtils.isEmpty((CharSequence)(var8_8 = var2_2.getMidRollAdspot()))) || (var8_8 = var2_2.getCuePoints()) == null || (var8_8 = var2_2.getCuePoints()) == null || (var10_10 = var8_8.isEmpty() ^ var13_13) != var13_13) ** GOTO lbl131
            }
            {
                block45: {
                    var8_8 = new StringBuilder();
                    var14_14 = var2_2.getMidRollAdspot();
                    var8_8.append((String)var14_14);
                    var14_14 = ": Inside Mid-roll fetching in vmap builder";
                    var8_8.append((String)var14_14);
                    var8_8 = var8_8.toString();
                    Intrinsics.checkNotNullParameter(var8_8, (String)var7_7);
                    var8_8 = JioAds.Companion;
                    var14_14 = var8_8.getInstance();
                    var14_14.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    var14_14 = JioAds$LogLevel.NONE;
                    var21_18 /* !! */  = new Object();
                    var22_21 = System.currentTimeMillis();
                    var24_22 = new Ref$IntRef();
                    var14_14 = new StringBuilder();
                    var25_23 = var2_2.getMidRollAdspot();
                    var14_14.append((String)var25_23);
                    var25_23 = ": CuePoint count: ";
                    var14_14.append((String)var25_23);
                    var25_23 = var2_2.getCuePoints();
                    if (var25_23 != null) {
                        var26_24 = var25_23.size();
                        var25_23 = var26_24;
                    } else {
                        var26_24 = 0;
                        var25_23 = null;
                    }
                    var14_14.append(var25_23);
                    var14_14 = var14_14.toString();
                    Intrinsics.checkNotNullParameter(var14_14, (String)var7_7);
                    var8_8 = var8_8.getInstance();
                    var8_8.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    var8_8 = var2_2.getCuePoints();
                    if (var8_8 == null) ** GOTO lbl129
                    var27_25 = var8_8.iterator();
lbl126:
                    // 3 sources

                    while (true) {
                        var10_10 = var27_25.hasNext();
                        if (var10_10) break block45;
lbl129:
                        // 2 sources

                        var21_18 /* !! */  = var11_11;
                        ** GOTO lbl213
                        break;
                    }
lbl131:
                    // 1 sources

                    var21_18 /* !! */  = var11_11;
                    var8_8 = "Mid-roll not available";
                    ** GOTO lbl203
                }
                var8_8 = var27_25.next();
                var8_8 = (Number)var8_8;
                var28_26 = var8_8.intValue();
                var18_17 = new Ref$ObjectRef();
                var14_14 = var2_2.getMidRollAdspot();
                if (var14_14 == null) {
                    var14_14 = var12_12 /* !! */ ;
                }
                var25_23 = JioAdView$AD_TYPE.INSTREAM_VIDEO;
                var18_17.element = var8_8 = new JioAdView(var5_5, (String)var14_14, (JioAdView$AD_TYPE)var25_23);
                var8_8 = var28_26;
                var14_14 = var4_4.i;
                var25_23 = var18_17.element;
                var14_14.put(var8_8, var25_23);
                var8_8 = var2_2.getMetadata();
                if (var8_8 != null) {
                    var14_14 = var18_17.element;
                    if ((var14_14 = (JioAdView)var14_14) != null && (var14_14 = var14_14.getIjioAdView$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) != null) {
                        var14_14 = var14_14.Y();
                    } else {
                        var19_19 = false;
                        var14_14 = null;
                    }
                    var8_8 = var8_8.getAdMetadata$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((Context)var14_14);
                } else {
                    var10_10 = false;
                    var8_8 = null;
                }
                if (var8_8 != null) {
                    Intrinsics.checkNotNullParameter(var11_11, (String)var7_7);
                    var8_8 = JioAds.Companion;
                    var8_8 = var8_8.getInstance();
                    var8_8.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    var8_8 = JioAds$LogLevel.NONE;
                    var8_8 = var18_17.element;
                    var8_8 = (JioAdView)var8_8;
                    if (var8_8 != null) {
                        var14_14 = new JioAdsMetadata$Builder();
                        var25_23 = var2_2.getMetadata();
                        if (var25_23 != null) {
                            var29_27 = var18_17.element;
                            var29_27 = (JioAdView)var29_27;
                            var29_27 = (var29_27 = var29_27.getIjioAdView$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) != null ? var29_27.Y() : null;
                            var25_23 = var25_23.getAdMetadata$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((Context)var29_27);
                        } else {
                            var26_24 = 0;
                            var25_23 = null;
                        }
                        var14_14 = var14_14.setCustomMetadata((Map)var25_23);
                        var14_14 = var14_14.build();
                        var8_8.setMetaData$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((JioAdsMetadata)var14_14);
                    }
                }
                var20_20 = var8_8 = var18_17.element;
                var20_20 = (JioAdView)var8_8;
                if (var20_20 == null) ** GOTO lbl126
                var8_8 = var17_16;
                var14_14 = var21_18 /* !! */ ;
                var25_23 = this;
                var29_27 = var2_2;
                var9_9 /* !! */  = var17_16;
                var17_16 = var24_22;
                var21_18 /* !! */  = var11_11;
                var11_11 = var3_3;
            }
            {
                var8_8 = new e(var14_14, this, var2_2, (Ref$IntRef)var24_22, (Ref$ObjectRef)var18_17, var22_21, var3_3);
                var8_8 = var28_26;
                var20_20.getAds$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((W)var9_9 /* !! */ , (Integer)var8_8);
                var11_11 = var21_18 /* !! */ ;
                var21_18 /* !! */  = var14_14;
                var13_13 = true;
                var9_9 /* !! */  = null;
                ** continue;
lbl203:
                // 1 sources

                Intrinsics.checkNotNullParameter(var8_8, (String)var7_7);
                var8_8 = JioAds.Companion;
                var8_8 = var8_8.getInstance();
                var8_8.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var8_8 = JioAds$LogLevel.NONE;
                var4_4.d = var10_10 = true;
                var10_10 = false;
                var8_8 = null;
                var4_4.a(var6_6, false);
lbl213:
                // 2 sources

                var8_8 = var2_2.getPostRollAdspot();
                var10_10 = TextUtils.isEmpty((CharSequence)var8_8);
                if (var10_10) ** GOTO lbl265
                var15_15 = System.currentTimeMillis();
                var14_14 = var2_2.getPostRollAdspot();
                if (var14_14 == null) {
                    var14_14 = var12_12 /* !! */ ;
                }
                var17_16 = JioAdView$AD_TYPE.INSTREAM_VIDEO;
                var4_4.h = var8_8 = new JioAdView(var5_5, (String)var14_14, (JioAdView$AD_TYPE)var17_16);
                var8_8 = var2_2.getMetadata();
                if (var8_8 != null) {
                    var14_14 = var4_4.h;
                    if (var14_14 != null && (var14_14 = var14_14.getIjioAdView$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) != null) {
                        var14_14 = var14_14.Y();
                    } else {
                        var19_19 = false;
                        var14_14 = null;
                    }
                    var8_8 = var8_8.getAdMetadata$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((Context)var14_14);
                } else {
                    var10_10 = false;
                    var8_8 = null;
                }
                if (var8_8 != null) {
                    Intrinsics.checkNotNullParameter(var21_18 /* !! */ , (String)var7_7);
                    var8_8 = JioAds.Companion;
                    var8_8 = var8_8.getInstance();
                    var8_8.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    var8_8 = JioAds$LogLevel.NONE;
                    var8_8 = var4_4.h;
                    if (var8_8 != null) {
                        var14_14 = new JioAdsMetadata$Builder();
                        var17_16 = var2_2.getMetadata();
                        if (var17_16 != null) {
                            var18_17 = var4_4.h;
                            var18_17 = var18_17 != null && (var18_17 = var18_17.getIjioAdView$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) != null ? var18_17.Y() : null;
                            var17_16 = var17_16.getAdMetadata$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((Context)var18_17);
                        } else {
                            var17_16 = null;
                        }
                        var14_14 = var14_14.setCustomMetadata((Map)var17_16);
                        var14_14 = var14_14.build();
                        var8_8.setMetaData$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((JioAdsMetadata)var14_14);
                    }
                }
                if ((var30_28 = var4_4.h) == null) return;
                var8_8 = var20_20;
                var14_14 = var2_2;
                var17_16 = this;
                var18_17 = var3_3;
                var20_20 = new f(var2_2, var15_15, this, var3_3);
                var10_10 = false;
                var8_8 = null;
            }
            try {
                var30_28.getAds$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((W)var20_20, null);
                return;
lbl265:
                // 1 sources

                var10_10 = false;
                var8_8 = null;
                var14_14 = "Post-roll not available";
                Intrinsics.checkNotNullParameter(var14_14, (String)var7_7);
                var14_14 = JioAds.Companion;
                var14_14 = var14_14.getInstance();
                var14_14.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var14_14 = JioAds$LogLevel.NONE;
                var4_4.f = var19_19 = true;
                var19_19 = false;
                var14_14 = null;
                var4_4.a(var6_6, false);
                return;
            }
            catch (Exception v1) {}
        }
        var14_14 = new StringBuilder("Exception inside getVMAPData method");
        var25_23 = Unit.a;
        var14_14.append(var25_23);
        Intrinsics.checkNotNullParameter(var14_14.toString(), (String)var7_7);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        var14_14 = JioAds$LogLevel.NONE;
        var9_9 /* !! */  = var4_4.k;
        if (var9_9 /* !! */  != null) {
            var7_7 = Utility.INSTANCE;
            var12_12 /* !! */  = com.jio.jioads.cdnlogging.d.a;
            var14_14 = JioAdError$JioAdErrorType.ERROR_IN_VMAP_BUILDER;
            var31_29 = var14_14.getErrorTitle();
            var25_23 = com.jio.jioads.jioreel.ssai.p.t;
            if (var25_23 != null) {
                var25_23 = new com.jio.jioads.cdnlogging.a();
                var32_30 = var25_23;
            } else {
                var32_30 = null;
            }
            var25_23 = var4_4.h;
            if (var25_23 != null) {
                var26_24 = var25_23.getShouldUseVolley();
                var25_23 = (boolean)var26_24;
                var27_25 = var25_23;
            } else {
                var27_25 = null;
            }
            var25_23 = var4_4.k;
            if (var25_23 != null) {
                var8_8 = var25_23.getPackageName();
            }
            var33_31 = var14_14.getErrorCode();
            var21_18 /* !! */  = "";
            var34_32 = "Exception while creating VMAP data";
            var24_22 = "JioAdsVMAPBuilder-generateVMAP";
            var7_7.logError(var9_9 /* !! */ , var21_18 /* !! */ , (d)var12_12 /* !! */ , var31_29, var34_32, (com.jio.jioads.cdnlogging.a)var32_30, (String)var24_22, (Boolean)var27_25, (String)var8_8, var33_31, false);
        }
        if ((var10_10 = var4_4.d) == false) return;
        var10_10 = var4_4.e;
        if (var10_10 == false) return;
        var10_10 = var4_4.f;
        if (var10_10 == false) return;
        var14_14 = Looper.getMainLooper();
        var8_8 = new Handler((Looper)var14_14);
        var14_14 = new b(var4_4, var6_6);
        var8_8.post((Runnable)var14_14);
        this.a();
    }

    public final void notifyMidrollPlayed(Integer object) {
        object = this.m;
        Object object2 = this.n;
        object2 = object2 != null ? ((JioAdsVMAPInfo)object2).getMidRollAdspot() : null;
        this.a((String)object, (String)object2);
    }

    public final void notifyPostrollPlayed() {
        Object object = this.n;
        object = object != null ? ((JioAdsVMAPInfo)object).getPostRollAdspot() : null;
        this.a(null, (String)object);
    }

    public final void notifyPrerollPlayed() {
        String string2 = this.l;
        Object object = this.n;
        object = object != null ? ((JioAdsVMAPInfo)object).getPreRollAdspot() : null;
        this.a(string2, (String)object);
    }

    public final void setContentDuration(int n3) {
    }

    public final void setMidRollAdSelectionFailedCount$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(int n3) {
        this.o = n3;
    }

    public final void setPostRollAdSelectionFailedCount$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(int n3) {
        this.q = n3;
    }

    public final void setPreRollAdSelectionFailedCount$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(int n3) {
        this.p = n3;
    }
}

