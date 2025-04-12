/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Parcelable
 *  org.json.JSONException
 */
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.FacebookException;
import com.facebook.share.model.CameraEffectArguments;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareHashtag;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideo;
import com.facebook.share.model.ShareVideoContent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

public final class Em3 {
    public static void a(byte[] byArray) {
        int n3;
        if (byArray == null) {
            return;
        }
        char[] cArray = "0123456789ABCDEF".toCharArray();
        int n4 = byArray.length * 2;
        char[] cArray2 = new char[n4];
        for (int i3 = 0; i3 < (n3 = byArray.length); ++i3) {
            n3 = byArray[i3];
            int n7 = n3 & 0xFF;
            int n8 = i3 * 2;
            n7 >>>= 4;
            cArray2[n8] = n7 = cArray[n7];
            n3 &= 0xF;
            cArray2[++n8] = n3 = cArray[n3];
        }
        new String(cArray2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final Bundle b(UUID var0, ShareContent var1_3, boolean var2_4) {
        block54: {
            block60: {
                block59: {
                    block58: {
                        block57: {
                            block56: {
                                block55: {
                                    Intrinsics.checkNotNullParameter(var0, "callId");
                                    var3_5 /* !! */  = "shareContent";
                                    Intrinsics.checkNotNullParameter(var1_3, (String)var3_5 /* !! */ );
                                    var4_6 = var1_3 instanceof ShareLinkContent;
                                    if (!var4_6) break block55;
                                    var1_3 = (ShareLinkContent)var1_3;
                                    var0 = Em3.c((ShareContent)var1_3, var2_4);
                                    var3_5 /* !! */  = var1_3.g;
                                    lz3_0.H((Bundle)var0, "QUOTE", (String)var3_5 /* !! */ );
                                    var1_3 = var1_3.a;
                                    lz3_0.I((Uri)var1_3, (Bundle)var0, "MESSENGER_LINK");
                                    var5_7 = "TARGET_DISPLAY";
                                    lz3_0.I((Uri)var1_3, (Bundle)var0, var5_7);
                                    break block54;
                                }
                                var4_6 = var1_3 instanceof SharePhotoContent;
                                if (!var4_6) break block56;
                                if ((var0 = w13_0.a((SharePhotoContent)(var1_3 = (SharePhotoContent)var1_3), (UUID)var0)) == null) {
                                    var0 = mz0_2.a;
                                }
                                var1_3 = Em3.c((ShareContent)var1_3, var2_4);
                                var0 = (Collection)var0;
                                var5_8 = new ArrayList<E>(var0);
                                var1_3.putStringArrayList("PHOTOS", var5_8);
                                var0 = var1_3;
                                break block54;
                            }
                            var4_6 = var1_3 instanceof ShareVideoContent;
                            var6_13 = null;
                            var7_14 = "appCallId";
                            if (!var4_6) break block57;
                            var1_3 = (ShareVideoContent)var1_3;
                            Intrinsics.checkNotNullParameter(var0, (String)var7_14);
                            if (var1_3 != null && (var3_5 /* !! */  = var1_3.j) != null && (var3_5 /* !! */  = var3_5 /* !! */ .b) != null) {
                                var0 = ls1_1.c((UUID)var0, (Uri)var3_5 /* !! */ );
                                var3_5 /* !! */  = a.b(var0);
                                ls1_1.a((Collection)var3_5 /* !! */ );
                                var6_13 = var0.d;
                            }
                            var0 = Em3.c((ShareContent)var1_3, var2_4);
                            var3_5 /* !! */  = var1_3.h;
                            lz3_0.H((Bundle)var0, "TITLE", (String)var3_5 /* !! */ );
                            var5_9 = "DESCRIPTION";
                            var1_3 = var1_3.g;
                            lz3_0.H((Bundle)var0, var5_9, (String)var1_3);
                            var1_3 = "VIDEO";
                            lz3_0.H((Bundle)var0, var1_3, (String)var6_13);
                            break block54;
                        }
                        var4_6 = var1_3 instanceof ShareMediaContent;
                        var8_15 = "type";
                        var9_16 = "uri";
                        if (!var4_6) break block58;
                        var1_3 = (ShareMediaContent)var1_3;
                        Intrinsics.checkNotNullParameter(var0, (String)var7_14);
                        if (var1_3 != null && (var3_5 /* !! */  = var1_3.g) != null) {
                            var7_14 = new ArrayList();
                            var3_5 /* !! */  = (Iterable)var3_5 /* !! */ ;
                            var10_17 = new ArrayList();
                            var3_5 /* !! */  = var3_5 /* !! */ .iterator();
                            while (var11_20 = var3_5 /* !! */ .hasNext()) {
                                var12_23 = (ShareMedia)var3_5 /* !! */ .next();
                                var13_26 = var12_23 instanceof SharePhoto;
                                if (var13_26) {
                                    var14_29 = var12_23;
                                    var14_29 = (SharePhoto)var12_23;
                                    var15_32 = var14_29.b;
                                    var14_29 = var14_29.c;
                                } else {
                                    var13_26 = var12_23 instanceof ShareVideo;
                                    if (var13_26) {
                                        var14_29 = var12_23;
                                        var14_29 = ((ShareVideo)var12_23).b;
                                        var16_33 = false;
                                        var15_32 = null;
                                    } else {
                                        var13_26 = false;
                                        var14_29 = null;
                                        var16_33 = false;
                                        var15_32 = null;
                                    }
                                }
                                if (var15_32 != null) {
                                    var14_29 = ls1_1.b((UUID)var0, var15_32);
                                } else if (var14_29 != null) {
                                    var14_29 = ls1_1.c((UUID)var0, (Uri)var14_29);
                                } else {
                                    var13_26 = false;
                                    var14_29 = null;
                                }
                                if (var14_29 == null) {
                                    var16_33 = false;
                                    var15_32 = null;
                                } else {
                                    var7_14.add(var14_29);
                                    var15_32 = new Bundle();
                                    var12_23 = var12_23.a().name();
                                    var15_32.putString((String)var8_15, (String)var12_23);
                                    var12_23 = var14_29.d;
                                    var15_32.putString(var9_16, (String)var12_23);
                                }
                                if (var15_32 == null) continue;
                                var10_17.add(var15_32);
                            }
                            ls1_1.a((Collection)var7_14);
                            var6_13 = var10_17;
                        }
                        if (var6_13 == null) {
                            var6_13 = mz0_2.a;
                        }
                        var0 = Em3.c((ShareContent)var1_3, var2_4);
                        var6_13 = (Collection)var6_13;
                        var1_3 = new ArrayList(var6_13);
                        var5_10 = "MEDIA";
                        var0.putParcelableArrayList(var5_10, var1_3);
                        break block54;
                    }
                    var4_6 = var1_3 instanceof ShareCameraEffectContent;
                    if (!var4_6) break block59;
                    var1_3 = (ShareCameraEffectContent)var1_3;
                    Intrinsics.checkNotNullParameter(var0, (String)var7_14);
                    if (var1_3 != null && (var3_5 /* !! */  = var1_3.i) != null) {
                        var7_14 = new Bundle();
                        var8_15 = new ArrayList();
                        var3_5 /* !! */  = var3_5 /* !! */ .a;
                        var9_16 = var3_5 /* !! */  != null ? var3_5 /* !! */ .keySet() : null;
                        if (var9_16 == null) {
                            var9_16 = vz0_2.a;
                        }
                        var9_16 = var9_16.iterator();
                        while (var17_35 = var9_16.hasNext()) {
                            var10_18 = (String)var9_16.next();
                            if (var3_5 /* !! */  != null) {
                                var12_24 = var3_5 /* !! */ .get(var10_18);
                            } else {
                                var11_21 = false;
                                var12_24 = null;
                            }
                            var13_27 = var12_24 instanceof Uri;
                            if (var13_27) {
                                var12_24 = (Uri)var12_24;
                            } else {
                                var11_21 = false;
                                var12_24 = null;
                            }
                            if (var3_5 /* !! */  != null) {
                                var14_30 = var3_5 /* !! */ .get(var10_18);
                            } else {
                                var13_27 = false;
                                var14_30 = null;
                            }
                            var16_34 = var14_30 instanceof Bitmap;
                            if (var16_34) {
                                var14_30 = (Bitmap)var14_30;
                            } else {
                                var13_27 = false;
                                var14_30 = null;
                            }
                            if (var14_30 != null) {
                                var12_24 = ls1_1.b((UUID)var0, (Bitmap)var14_30);
                            } else if (var12_24 != null) {
                                var12_24 = ls1_1.c((UUID)var0, (Uri)var12_24);
                            } else {
                                var11_21 = false;
                                var12_24 = null;
                            }
                            if (var12_24 == null) continue;
                            var8_15.add(var12_24);
                            var12_24 = ((ls1$a_0)var12_24).d;
                            var7_14.putString(var10_18, (String)var12_24);
                        }
                        ls1_1.a(var8_15);
                        var6_13 = var7_14;
                    }
                    var0 = Em3.c((ShareContent)var1_3, var2_4);
                    var5_11 = "effect_id";
                    var3_5 /* !! */  = var1_3.g;
                    lz3_0.H((Bundle)var0, (String)var5_11, (String)var3_5 /* !! */ );
                    if (var6_13 != null) {
                        var5_11 = "effect_textures";
                        var0.putBundle((String)var5_11, (Bundle)var6_13);
                    }
                    try {
                        var1_3 = var1_3.h;
                    }
                    catch (JSONException var0_1) {
                        var5_11 = new StringBuilder("Unable to create a JSON Object from the provided CameraEffectArguments: ");
                        var0_2 = var0_1.getMessage();
                        var5_11.append(var0_2);
                        var0_2 = var5_11.toString();
                        var1_3 = new FacebookException(var0_2);
                        throw var1_3;
                    }
                    var1_3 = ik_1.a((CameraEffectArguments)var1_3);
                    if (var1_3 == null) break block54;
                    var5_11 = "effect_arguments";
                    var1_3 = var1_3.toString();
                    lz3_0.H((Bundle)var0, (String)var5_11, (String)var1_3);
                }
                var4_6 = var1_3 instanceof ShareStoryContent;
                if (!var4_6) break block60;
                var1_3 = (ShareStoryContent)var1_3;
                Intrinsics.checkNotNullParameter(var0, (String)var7_14);
                var3_5 /* !! */  = "extension";
                if (var1_3 == null || (var10_19 = var1_3.g) == null) ** GOTO lbl-1000
                var11_22 = var10_19 instanceof SharePhoto;
                if (var11_22) {
                    var12_25 = var10_19;
                    var12_25 = (SharePhoto)var10_19;
                    var14_31 = var12_25.b;
                    var12_25 = var12_25.c;
                } else {
                    var11_22 = var10_19 instanceof ShareVideo;
                    if (var11_22) {
                        var12_25 = var10_19;
                        var12_25 = ((ShareVideo)var10_19).b;
                        var13_28 = false;
                        var14_31 = null;
                    } else {
                        var11_22 = false;
                        var12_25 = null;
                        var13_28 = false;
                        var14_31 = null;
                    }
                }
                if (var14_31 != null) {
                    var12_25 = ls1_1.b((UUID)var0, var14_31);
                } else if (var12_25 != null) {
                    var12_25 = ls1_1.c((UUID)var0, (Uri)var12_25);
                } else {
                    var11_22 = false;
                    var12_25 = null;
                }
                if (var12_25 == null) lbl-1000:
                // 2 sources

                {
                    var13_28 = false;
                    var14_31 = null;
                } else {
                    var14_31 = new Bundle();
                    var10_19 = var10_19.a().name();
                    var14_31.putString((String)var8_15, (String)var10_19);
                    var8_15 = var12_25.d;
                    var14_31.putString(var9_16, (String)var8_15);
                    var8_15 = w13_0.b(var12_25.c);
                    if (var8_15 != null) {
                        lz3_0.H((Bundle)var14_31, (String)var3_5 /* !! */ , (String)var8_15);
                    }
                    var8_15 = a.b(var12_25);
                    ls1_1.a((Collection)var8_15);
                }
                Intrinsics.checkNotNullParameter(var0, (String)var7_14);
                if (var1_3 == null || (var7_14 = var1_3.h) == null) ** GOTO lbl-1000
                var8_15 = new ArrayList();
                var8_15.add(var7_14);
                var8_15 = var7_14.b;
                var0 = var8_15 != null ? ls1_1.b((UUID)var0, (Bitmap)var8_15) : ((var7_14 = var7_14.c) != null ? ls1_1.c((UUID)var0, (Uri)var7_14) : null);
                if (var0 == null) lbl-1000:
                // 2 sources

                {
                    var7_14 = null;
                } else {
                    var7_14 = new Bundle();
                    var8_15 = var0.d;
                    var7_14.putString(var9_16, (String)var8_15);
                    var8_15 = w13_0.b(var0.c);
                    if (var8_15 != null) {
                        lz3_0.H((Bundle)var7_14, (String)var3_5 /* !! */ , (String)var8_15);
                    }
                    var0 = a.b(var0);
                    ls1_1.a((Collection)var0);
                }
                var0 = Em3.c((ShareContent)var1_3, var2_4);
                if (var14_31 != null) {
                    var5_12 = "bg_asset";
                    var0.putParcelable((String)var5_12, (Parcelable)var14_31);
                }
                if (var7_14 != null) {
                    var5_12 = "interactive_asset_uri";
                    var0.putParcelable((String)var5_12, (Parcelable)var7_14);
                }
                if ((var5_12 = var1_3.i) != null) {
                    var5_12 = var5_12;
                    var6_13 = CollectionsKt.k0(var5_12);
                }
                if ((var6_13 = (Collection)var6_13) != null && !(var2_4 = var6_13.isEmpty())) {
                    var5_12 = new ArrayList<E>(var6_13);
                    var3_5 /* !! */  = "top_background_color_list";
                    var0.putStringArrayList((String)var3_5 /* !! */ , var5_12);
                }
                var5_12 = "content_url";
                var1_3 = var1_3.j;
                lz3_0.H((Bundle)var0, (String)var5_12, (String)var1_3);
                break block54;
            }
            var0 = null;
        }
        return var0;
    }

    public static Bundle c(ShareContent object, boolean bl2) {
        boolean bl3;
        Bundle bundle = new Bundle();
        lz3_0.I(((ShareContent)object).a, bundle, "LINK");
        String string2 = ((ShareContent)object).c;
        lz3_0.H(bundle, "PLACE", string2);
        string2 = ((ShareContent)object).d;
        lz3_0.H(bundle, "PAGE", string2);
        ArrayList arrayList = "REF";
        string2 = ((ShareContent)object).e;
        lz3_0.H(bundle, (String)((Object)arrayList), string2);
        lz3_0.H(bundle, (String)((Object)arrayList), string2);
        arrayList = "DATA_FAILURES_FATAL";
        bundle.putBoolean((String)((Object)arrayList), bl2);
        Object object2 = ((ShareContent)object).b;
        if (object2 != null && !(bl3 = object2.isEmpty())) {
            arrayList = new ArrayList(object2);
            object2 = "FRIENDS";
            bundle.putStringArrayList((String)object2, arrayList);
        }
        object = (object = ((ShareContent)object).f) != null ? ((ShareHashtag)object).a : null;
        lz3_0.H(bundle, "HASHTAG", (String)object);
        return bundle;
    }

    public static byte[] d(String object) {
        Object object2 = "";
        Object object3 = ((String)object).replace(" ", (CharSequence)object2);
        int n3 = ((String)object3).length() % 2;
        if (n3 == 0) {
            int n4;
            float f5 = (float)((String)object3).length() / 2.0f;
            int n7 = Math.round(f5);
            object = new byte[n7];
            n3 = 0;
            object2 = null;
            int n8 = 0;
            while (n3 < (n4 = ((String)object3).length())) {
                n4 = n3 + 2;
                object2 = Integer.parseInt(((String)object3).substring(n3, n4), 16);
                int n10 = n8 + 1;
                n3 = ((Integer)object2).byteValue();
                object[n8] = n3;
                n3 = n4;
                n8 = n10;
            }
            return object;
        }
        object = "Hex binary needs to be even-length :".concat((String)object);
        object3 = new IllegalArgumentException((String)object);
        throw object3;
    }

    public static final long e(double d2) {
        float f5 = (float)d2;
        return Em3.i(0x100000000L, f5);
    }

    public static final long f(int n3) {
        float f5 = n3;
        return Em3.i(0x100000000L, f5);
    }

    public static final boolean g(long l2) {
        long l3 = 0L;
        long l4 = (l2 &= 0xFF00000000L) - l3;
        long l7 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = l7 == false;
        return bl2;
    }

    public static boolean h(int n3, int n4) {
        int n7;
        if (n4 >= 0 && n4 <= (n7 = 31)) {
            n7 = 1;
            if ((n3 &= (n4 = n7 << n4)) == 0) {
                n7 = 0;
            }
            return n7 != 0;
        }
        String string2 = hj0_0.a(n4, "parameter 'pBitIndex' must be between 0 and 31. pBitIndex=");
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public static final long i(long l2, float f5) {
        long l3 = (long)Float.floatToIntBits(f5) & 0xFFFFFFFFL;
        return l2 |= l3;
    }

    public static byte j(byte by2, int n3) {
        int n4;
        if (n3 >= 0 && n3 <= (n4 = 7)) {
            n3 = 1 << n3;
            return (byte)(by2 | n3);
        }
        String string2 = hj0_0.a(n3, "parameter 'pBitIndex' must be between 0 and 7. pBitIndex=");
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }
}

