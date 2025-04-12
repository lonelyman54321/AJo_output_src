/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.text.Spanned
 *  android.text.style.AbsoluteSizeSpan
 *  android.text.style.BackgroundColorSpan
 *  android.text.style.ForegroundColorSpan
 *  android.text.style.RelativeSizeSpan
 *  android.text.style.StrikethroughSpan
 *  android.text.style.StyleSpan
 *  android.text.style.TypefaceSpan
 *  android.text.style.UnderlineSpan
 *  android.util.AttributeSet
 *  android.util.Base64
 *  android.util.DisplayMetrics
 *  android.util.SparseArray
 *  android.view.View
 *  android.widget.FrameLayout
 */
package androidx.media3.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.media3.ui.CanvasSubtitleOutput;
import androidx.media3.ui.SubtitleView$a;
import androidx.media3.ui.WebViewSubtitleOutput$a;
import androidx.media3.ui.WebViewSubtitleOutput$b;
import androidx.media3.ui.a;
import androidx.media3.ui.a$a;
import androidx.media3.ui.a$b;
import androidx.media3.ui.a$c;
import com.google.common.collect.ImmutableMap;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

final class WebViewSubtitleOutput
extends FrameLayout
implements SubtitleView$a {
    public final CanvasSubtitleOutput a;
    public final WebViewSubtitleOutput$a b;
    public List c;
    public FL d;
    public float e;
    public int f;
    public float g;

    public WebViewSubtitleOutput(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        WebViewSubtitleOutput$a webViewSubtitleOutput$a;
        CanvasSubtitleOutput canvasSubtitleOutput;
        Object object = Collections.emptyList();
        this.c = object;
        this.d = object = FL.g;
        this.e = 0.0533f;
        this.f = 0;
        this.g = 0.08f;
        this.a = canvasSubtitleOutput = new CanvasSubtitleOutput(context, attributeSet);
        super(context, attributeSet);
        this.b = webViewSubtitleOutput$a;
        webViewSubtitleOutput$a.setBackgroundColor(0);
        this.addView(canvasSubtitleOutput);
        this.addView((View)webViewSubtitleOutput$a);
    }

    public final void a(List list, FL fL, float f5, int n3, float f6) {
        int n4;
        this.d = fL;
        this.e = f5;
        this.f = n3;
        this.g = f6;
        ArrayList<Pe0> arrayList = new ArrayList<Pe0>();
        ArrayList<Pe0> arrayList2 = new ArrayList<Pe0>();
        for (int i3 = 0; i3 < (n4 = list.size()); ++i3) {
            Pe0 pe0 = (Pe0)list.get(i3);
            Bitmap bitmap = pe0.d;
            if (bitmap != null) {
                arrayList.add(pe0);
                continue;
            }
            arrayList2.add(pe0);
        }
        list = this.c;
        boolean bl2 = list.isEmpty();
        if (!bl2 || !(bl2 = arrayList2.isEmpty())) {
            this.c = arrayList2;
            this.c();
        }
        this.a.a(arrayList, fL, f5, n3, f6);
        this.invalidate();
    }

    public final String b(float f5, int n3) {
        float f6;
        int n4 = this.getHeight();
        int n7 = this.getHeight();
        int n8 = this.getPaddingTop();
        n7 -= n8;
        n8 = this.getPaddingBottom();
        float f7 = (f5 = zf3_0.b(n3, f5, n4, n7 -= n8)) - (f6 = -3.4028235E38f);
        if ((n3 = (int)(f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1))) == 0) {
            return "unset";
        }
        f6 = this.getContext().getResources().getDisplayMetrics().density;
        Float f8 = Float.valueOf(f5 / f6);
        Object[] objectArray = new Object[]{f8};
        return String.format(Locale.US, "%.2fpx", objectArray);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void c() {
        Object object;
        String string2;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        float f5;
        Object object7;
        HashMap<Object[], Object> hashMap;
        int n3;
        Object object8;
        float f6;
        Object object9;
        Object object10;
        float f7;
        Object object11;
        float f8;
        Object object12;
        float f11;
        Object object13;
        Object object14;
        block73: {
            int n4;
            block79: {
                block80: {
                    object14 = this;
                    object13 = 4;
                    f11 = 5.6E-45f;
                    object12 = 3;
                    Object object15 = 2;
                    f8 = 2.8E-45f;
                    object11 = 0;
                    f7 = 0.0f;
                    object10 = null;
                    object9 = 1;
                    f6 = Float.MIN_VALUE;
                    object8 = new StringBuilder();
                    n3 = this.d.a;
                    hashMap = ht2_0.d(n3);
                    object7 = this.f;
                    f5 = this.e;
                    object6 = this.b(f5, (int)object7);
                    object5 = 1067030938;
                    f5 = 1.2f;
                    object4 = Float.valueOf(f5);
                    object3 = this.d;
                    object2 = ((FL)object3).d;
                    string2 = "unset";
                    n4 = ((FL)object3).e;
                    if (object2 == object9) break block79;
                    if (object2 == object15) break block80;
                    if (object2 != object12) {
                        if (object2 != object13) {
                            object3 = string2;
                            break block73;
                        } else {
                            object3 = ht2_0.d(n4);
                            object2 = gz3.a;
                            object = Locale.US;
                            object = "-0.05em -0.05em 0.15em ";
                            object3 = ((String)object).concat((String)object3);
                        }
                        break block73;
                    } else {
                        object3 = ht2_0.d(n4);
                        object2 = gz3.a;
                        object = Locale.US;
                        object = "0.06em 0.08em 0.15em ";
                        object3 = ((String)object).concat((String)object3);
                    }
                    break block73;
                }
                object3 = ht2_0.d(n4);
                object2 = gz3.a;
                object = Locale.US;
                object = "0.1em 0.12em 0.15em ";
                object3 = ((String)object).concat((String)object3);
                break block73;
            }
            object3 = ht2_0.d(n4);
            object = new Object[object9];
            object[0] = object3;
            n4 = gz3.a;
            object3 = Locale.US;
            String string3 = "1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s";
            object3 = String.format((Locale)object3, string3, (Object[])object);
        }
        object = new Object[object13];
        object[0] = hashMap;
        object[object9] = object6;
        object[object15] = object4;
        object[object12] = object3;
        n3 = gz3.a;
        hashMap = String.format(Locale.US, "<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>", (Object[])object);
        ((StringBuilder)object8).append((String)((Object)hashMap));
        hashMap = new HashMap<Object[], Object>();
        object7 = ((WebViewSubtitleOutput)object14).d.b;
        object6 = ht2_0.d(object7);
        object3 = "background-color:";
        object4 = new StringBuilder((String)object3);
        ((StringBuilder)object4).append((String)object6);
        object6 = ";";
        ((StringBuilder)object4).append((String)object6);
        object4 = ((StringBuilder)object4).toString();
        object = ".default_bg,.default_bg *";
        hashMap.put((Object[])object, object4);
        Object object16 = 0;
        object4 = null;
        while (true) {
            void var57_85;
            void var55_79;
            Object[] objectArray;
            Object object17;
            Object object18;
            Object object19;
            Object object20;
            Object[] objectArray2;
            Iterator iterator;
            String string4;
            CharSequence charSequence;
            String string5;
            String string6;
            Object object21;
            String string7;
            String string8;
            StringBuilder stringBuilder;
            Object object22;
            Object object23;
            String string9;
            Object object24;
            Object object25;
            Object object26;
            Object object27;
            Object object28;
            Object object29;
            float f12;
            block93: {
                void var39_40;
                Object object30;
                float f14;
                float f15;
                Object object31;
                block94: {
                    block81: {
                        float f16;
                        block92: {
                            String string10;
                            block91: {
                                block90: {
                                    String string11;
                                    block88: {
                                        String string12;
                                        block89: {
                                            block86: {
                                                block87: {
                                                    float f17;
                                                    float f18;
                                                    block85: {
                                                        block84: {
                                                            block82: {
                                                                block83: {
                                                                    if (object16 >= (object2 = (object = ((WebViewSubtitleOutput)object14).c).size())) break block81;
                                                                    object = (Pe0)((WebViewSubtitleOutput)object14).c.get((int)object16);
                                                                    f12 = ((Pe0)object).h;
                                                                    object31 = -8388609;
                                                                    f15 = -3.4028235E38f;
                                                                    f14 = 100.0f;
                                                                    object29 = f12 == f15 ? 0 : (f12 > f15 ? 1 : -1);
                                                                    f12 = object29 != false ? (f12 *= f14) : 50.0f;
                                                                    object29 = -50;
                                                                    f18 = 0.0f / 0.0f;
                                                                    object28 = -100;
                                                                    object13 = ((Pe0)object).i;
                                                                    if (object13 != object9) {
                                                                        if (object13 != object27) {
                                                                            object13 = 0;
                                                                            f11 = 0.0f;
                                                                            object26 = null;
                                                                        } else {
                                                                            object13 = -100;
                                                                            f11 = 0.0f / 0.0f;
                                                                        }
                                                                    } else {
                                                                        object13 = -50;
                                                                        f11 = 0.0f / 0.0f;
                                                                    }
                                                                    f17 = 1.0f;
                                                                    object25 = "%.2f%%";
                                                                    object5 = ((Pe0)object).p;
                                                                    f8 = ((Pe0)object).e;
                                                                    float f19 = f8 == f15 ? 0 : (f8 > f15 ? 1 : -1);
                                                                    if (f19 == false) break block82;
                                                                    object31 = ((Pe0)object).f;
                                                                    if (object31 == object9) break block83;
                                                                    object24 = Float.valueOf(f8 *= f14);
                                                                    Object[] objectArray3 = new Object[object9];
                                                                    objectArray3[0] = object24;
                                                                    object24 = String.format(Locale.US, (String)object25, objectArray3);
                                                                    object31 = ((Pe0)object).g;
                                                                    if (object5 == object9) {
                                                                        if (object31 != object9) {
                                                                            object11 = 2;
                                                                            f7 = 2.8E-45f;
                                                                            if (object31 != object11) {
                                                                                object31 = 0;
                                                                                f15 = 0.0f;
                                                                                Object var39_42 = null;
                                                                            } else {
                                                                                object31 = -100;
                                                                                f15 = 0.0f / 0.0f;
                                                                            }
                                                                        } else {
                                                                            object11 = 2;
                                                                            f7 = 2.8E-45f;
                                                                            object31 = -50;
                                                                            f15 = 0.0f / 0.0f;
                                                                        }
                                                                        object28 = object31 = -object31;
                                                                        break block84;
                                                                    } else {
                                                                        object11 = 2;
                                                                        f7 = 2.8E-45f;
                                                                        if (object31 != object9) {
                                                                            if (object31 != object11) {
                                                                                object29 = false;
                                                                                f18 = 0.0f;
                                                                            } else {
                                                                                object29 = -100;
                                                                                f18 = 0.0f / 0.0f;
                                                                            }
                                                                        }
                                                                        object28 = object29;
                                                                    }
                                                                    break block84;
                                                                }
                                                                object10 = "%.2fem";
                                                                float f20 = f8 - 0.0f;
                                                                object31 = f20 == 0.0f ? 0 : (f20 > 0.0f ? 1 : -1);
                                                                if (object31 >= 0) {
                                                                    object31 = 1067030938;
                                                                    f15 = 1.2f;
                                                                    object24 = Float.valueOf(f8 *= f15);
                                                                    Object[] objectArray4 = new Object[object9];
                                                                    objectArray4[0] = object24;
                                                                    object24 = String.format(Locale.US, (String)object10, objectArray4);
                                                                    object11 = 0;
                                                                    f7 = 0.0f;
                                                                    object10 = null;
                                                                } else {
                                                                    f8 = -f8 - f17;
                                                                    object31 = 1067030938;
                                                                    f15 = 1.2f;
                                                                    object24 = Float.valueOf(f8 *= f15);
                                                                    Object[] objectArray5 = new Object[object9];
                                                                    objectArray5[0] = object24;
                                                                    object24 = String.format(Locale.US, (String)object10, objectArray5);
                                                                    object11 = 1;
                                                                    f7 = Float.MIN_VALUE;
                                                                }
                                                                object28 = 0;
                                                                break block85;
                                                            }
                                                            f8 = ((WebViewSubtitleOutput)object14).g;
                                                            f17 = (f17 - f8) * f14;
                                                            object24 = Float.valueOf(f17);
                                                            object10 = new Object[object9];
                                                            object10[0] = object24;
                                                            object24 = String.format(Locale.US, (String)object25, (Object[])object10);
                                                        }
                                                        object11 = 0;
                                                        f7 = 0.0f;
                                                        object10 = null;
                                                    }
                                                    f15 = ((Pe0)object).j;
                                                    f18 = -3.4028235E38f;
                                                    object29 = f15 == f18 ? 0 : (f15 > f18 ? 1 : -1);
                                                    if (object29 != false) {
                                                        Float f22 = Float.valueOf(f15 *= f14);
                                                        object29 = object13;
                                                        f18 = f11;
                                                        object26 = new Object[object9];
                                                        f17 = 0.0f;
                                                        string9 = null;
                                                        object26[0] = f22;
                                                        Locale locale = Locale.US;
                                                        object26 = String.format(locale, (String)object25, (Object[])object26);
                                                    } else {
                                                        object29 = object13;
                                                        f18 = f11;
                                                        object26 = "fit-content";
                                                    }
                                                    object25 = "start";
                                                    String string13 = "end";
                                                    string9 = "center";
                                                    object23 = ((Pe0)object).b;
                                                    if (object23 == null) {
                                                        object22 = object25;
                                                        String string14 = string13;
                                                        object23 = string9;
                                                        object12 = 2;
                                                    } else {
                                                        object22 = WebViewSubtitleOutput$b.a;
                                                        object9 = ((Enum)object23).ordinal();
                                                        object9 = object22[object9];
                                                        object22 = object25;
                                                        object12 = 1;
                                                        if (object9 != object12) {
                                                            object12 = 2;
                                                            if (object9 != object12) {
                                                                String string15 = string13;
                                                                object23 = string9;
                                                            } else {
                                                                object23 = string13;
                                                                String string16 = string13;
                                                            }
                                                        } else {
                                                            object12 = 2;
                                                            String string17 = string13;
                                                            object23 = object25;
                                                        }
                                                    }
                                                    object31 = 1;
                                                    f15 = Float.MIN_VALUE;
                                                    object25 = object5 != object31 ? (object5 != object12 ? "horizontal-tb" : "vertical-lr") : "vertical-rl";
                                                    object31 = ((Pe0)object).n;
                                                    stringBuilder = object8;
                                                    f16 = ((Pe0)object).o;
                                                    object8 = ((WebViewSubtitleOutput)object14).b(f16, (int)object31);
                                                    object31 = ((Pe0)object).l;
                                                    if (object31 != 0) {
                                                        object31 = ((Pe0)object).m;
                                                    } else {
                                                        FL fL = ((WebViewSubtitleOutput)object14).d;
                                                        object31 = fL.c;
                                                    }
                                                    string11 = ht2_0.d(object31);
                                                    string8 = "right";
                                                    string7 = "top";
                                                    string12 = "left";
                                                    object21 = 1;
                                                    if (object5 == object21) break block86;
                                                    object21 = 2;
                                                    if (object5 == object21) break block87;
                                                    if (object11 != 0) {
                                                        string7 = "bottom";
                                                    }
                                                    string8 = string7;
                                                    string7 = string12;
                                                    break block88;
                                                }
                                                if (object11 == 0) break block89;
                                                break block88;
                                            }
                                            if (object11 == 0) break block88;
                                        }
                                        string8 = string12;
                                    }
                                    object21 = 2;
                                    if (object5 != object21 && object5 != (object21 = 1)) {
                                        object14 = "width";
                                    } else {
                                        object14 = "height";
                                        Object object32 = object28;
                                        object28 = object29;
                                        object29 = object32;
                                    }
                                    object10 = this.getContext().getResources().getDisplayMetrics();
                                    f7 = ((DisplayMetrics)object10).density;
                                    Pattern pattern = androidx.media3.ui.a.a;
                                    string6 = string11;
                                    string5 = "</span>";
                                    string10 = ";'>";
                                    charSequence = object8;
                                    object8 = "";
                                    string4 = object25;
                                    object25 = ((Pe0)object).a;
                                    if (object25 != null) break block90;
                                    object10 = ImmutableMap.of();
                                    object25 = new a$a((String)object8, (Map)object10);
                                    iterator = object14;
                                    Object object33 = object26;
                                    objectArray2 = object24;
                                    Object object34 = object23;
                                    object20 = object8;
                                    break block91;
                                }
                                object20 = object8;
                                object19 = object25 instanceof Spanned;
                                if (object19 != 0) break block92;
                                object25 = androidx.media3.ui.a.a((CharSequence)object25);
                                object8 = ImmutableMap.of();
                                object10 = new a$a((String)object25, (Map)object8);
                                iterator = object14;
                                Object object35 = object26;
                                objectArray2 = object24;
                                object25 = object10;
                                Object object36 = object23;
                            }
                            object18 = object6;
                            object17 = object5;
                            objectArray = object3;
                            String string18 = string10;
                            break block93;
                        }
                        object25 = (Spanned)object25;
                        object8 = new HashSet();
                        Object object37 = object23;
                        object9 = object25.length();
                        Object object38 = object26;
                        iterator = object14;
                        object14 = null;
                        object26 = (BackgroundColorSpan[])object25.getSpans(0, object9, BackgroundColorSpan.class);
                        object21 = ((Object[])object26).length;
                        f6 = 0.0f;
                        object23 = null;
                        for (object9 = 0; object9 < object21; ++object9) {
                            Object object39 = object26[object9];
                            int n7 = object39.getBackgroundColor();
                            object14 = n7;
                            ((HashSet)object8).add(object14);
                        }
                        object14 = new HashMap();
                        object26 = ((HashSet)object8).iterator();
                        while ((object9 = (Object)object26.hasNext()) != 0) {
                            object9 = (Integer)object26.next();
                            object8 = hj0_0.a(object9, "bg_");
                            Object object40 = object26;
                            objectArray2 = object24;
                            object17 = object5;
                            object30 = " *";
                            object26 = uc0_0.a(".", (String)object8, ",.", (String)object8, (String)object30);
                            object24 = ht2_0.d(object9);
                            object9 = gz3.a;
                            object23 = Locale.US;
                            object23 = new StringBuilder((String)object3);
                            ((StringBuilder)object23).append((String)object24);
                            ((StringBuilder)object23).append((String)object6);
                            object24 = ((StringBuilder)object23).toString();
                            ((HashMap)object14).put(object26, object24);
                            object26 = object40;
                            object24 = objectArray2;
                        }
                        objectArray2 = object24;
                        object17 = object5;
                        object26 = new SparseArray();
                        object27 = object25.length();
                        object23 = Object.class;
                        object24 = object25.getSpans(0, object27, (Class)object23);
                        object9 = ((Object[])object24).length;
                        f16 = 0.0f;
                        object8 = null;
                        break block94;
                    }
                    object10 = object8;
                    ((StringBuilder)object8).append("</div></body></html>");
                    object14 = new StringBuilder("<html><head><style>");
                    object26 = hashMap.keySet().iterator();
                    while (true) {
                        if ((object12 = (Object)object26.hasNext()) == 0) {
                            ((StringBuilder)object14).append("</style></head>");
                            object14 = ((StringBuilder)object14).toString();
                            ((StringBuilder)object10).insert(0, (String)object14);
                            object14 = ((StringBuilder)object10).toString();
                            object26 = StandardCharsets.UTF_8;
                            object14 = Base64.encodeToString((byte[])((String)object14).getBytes((Charset)object26), (int)1);
                            object24 = this;
                            this.b.loadData((String)object14, "text/html", "base64");
                            return;
                        }
                        object25 = (String)object26.next();
                        ((StringBuilder)object14).append((String)object25);
                        object24 = "{";
                        ((StringBuilder)object14).append((String)object24);
                        object25 = (String)hashMap.get(object25);
                        ((StringBuilder)object14).append((String)object25);
                        object25 = "}";
                        ((StringBuilder)object14).append((String)object25);
                    }
                }
                for (object19 = 0; object19 < object9; object19 += object27) {
                    void var62_101;
                    Object object41;
                    float f23;
                    Object object42;
                    block122: {
                        block117: {
                            String string19;
                            block119: {
                                block120: {
                                    block121: {
                                        block118: {
                                            block96: {
                                                block78: {
                                                    block115: {
                                                        block116: {
                                                            block114: {
                                                                block112: {
                                                                    block113: {
                                                                        block107: {
                                                                            block111: {
                                                                                block98: {
                                                                                    block77: {
                                                                                        block108: {
                                                                                            block109: {
                                                                                                block110: {
                                                                                                    block104: {
                                                                                                        block105: {
                                                                                                            block106: {
                                                                                                                block103: {
                                                                                                                    block102: {
                                                                                                                        block101: {
                                                                                                                            block100: {
                                                                                                                                block99: {
                                                                                                                                    block97: {
                                                                                                                                        block95: {
                                                                                                                                            object30 = object24[object19];
                                                                                                                                            object42 = object24;
                                                                                                                                            object27 = object30 instanceof StrikethroughSpan;
                                                                                                                                            string19 = null;
                                                                                                                                            if (object27 == 0) break block95;
                                                                                                                                            String string20 = "<span style='text-decoration:line-through;'>";
                                                                                                                                            f23 = f7;
                                                                                                                                            object18 = object6;
                                                                                                                                            objectArray = object3;
                                                                                                                                            void var62_97 = var39_40;
                                                                                                                                            object41 = object9;
                                                                                                                                            object23 = string20;
                                                                                                                                            break block96;
                                                                                                                                        }
                                                                                                                                        object41 = object9;
                                                                                                                                        object9 = object30 instanceof ForegroundColorSpan;
                                                                                                                                        if (object9 == 0) break block97;
                                                                                                                                        object23 = object30;
                                                                                                                                        object9 = ((ForegroundColorSpan)object30).getForegroundColor();
                                                                                                                                        object23 = ht2_0.d(object9);
                                                                                                                                        object18 = Locale.US;
                                                                                                                                        object18 = object6;
                                                                                                                                        object6 = "<span style='color:";
                                                                                                                                        object23 = cP.a((String)object6, (String)object23, (String)var39_40);
                                                                                                                                        f23 = f7;
                                                                                                                                        objectArray = object3;
                                                                                                                                        break block98;
                                                                                                                                    }
                                                                                                                                    object18 = object6;
                                                                                                                                    object9 = object30 instanceof BackgroundColorSpan;
                                                                                                                                    if (object9 == 0) break block99;
                                                                                                                                    object23 = object30;
                                                                                                                                    object9 = ((BackgroundColorSpan)object30).getBackgroundColor();
                                                                                                                                    object7 = gz3.a;
                                                                                                                                    object6 = Locale.US;
                                                                                                                                    object6 = "<span class='bg_";
                                                                                                                                    objectArray = object3;
                                                                                                                                    object3 = "'>";
                                                                                                                                    object23 = Gj0.b(object9, (String)object6, (String)object3);
                                                                                                                                    break block77;
                                                                                                                                }
                                                                                                                                objectArray = object3;
                                                                                                                                object9 = object30 instanceof u91;
                                                                                                                                if (object9 == 0) break block100;
                                                                                                                                object23 = "<span style='text-combine-upright:all;'>";
                                                                                                                                break block77;
                                                                                                                            }
                                                                                                                            object9 = object30 instanceof AbsoluteSizeSpan;
                                                                                                                            if (object9 == 0) break block101;
                                                                                                                            object23 = object30;
                                                                                                                            object23 = (AbsoluteSizeSpan)object30;
                                                                                                                            object7 = object23.getDip();
                                                                                                                            if (object7 != 0) {
                                                                                                                                object9 = object23.getSize();
                                                                                                                                f6 = object9;
                                                                                                                            } else {
                                                                                                                                object9 = object23.getSize();
                                                                                                                                f6 = (float)object9 / f7;
                                                                                                                            }
                                                                                                                            object23 = Float.valueOf(f6);
                                                                                                                            object3 = new Object[1];
                                                                                                                            object7 = 0;
                                                                                                                            object3[0] = object23;
                                                                                                                            object9 = gz3.a;
                                                                                                                            object23 = Locale.US;
                                                                                                                            object6 = "<span style='font-size:%.2fpx;'>";
                                                                                                                            object23 = String.format((Locale)object23, (String)object6, (Object[])object3);
                                                                                                                            break block77;
                                                                                                                        }
                                                                                                                        object9 = object30 instanceof RelativeSizeSpan;
                                                                                                                        if (object9 == 0) break block102;
                                                                                                                        object23 = object30;
                                                                                                                        f6 = ((RelativeSizeSpan)object30).getSizeChange() * f14;
                                                                                                                        object23 = Float.valueOf(f6);
                                                                                                                        object3 = new Object[1];
                                                                                                                        object7 = 0;
                                                                                                                        object3[0] = object23;
                                                                                                                        object9 = gz3.a;
                                                                                                                        object23 = Locale.US;
                                                                                                                        object6 = "<span style='font-size:%.2f%%;'>";
                                                                                                                        object23 = String.format((Locale)object23, (String)object6, (Object[])object3);
                                                                                                                        break block77;
                                                                                                                    }
                                                                                                                    object9 = object30 instanceof TypefaceSpan;
                                                                                                                    if (object9 == 0) break block103;
                                                                                                                    object23 = object30;
                                                                                                                    object23 = ((TypefaceSpan)object30).getFamily();
                                                                                                                    if (object23 != null) {
                                                                                                                        object7 = gz3.a;
                                                                                                                        object6 = Locale.US;
                                                                                                                        object6 = "<span style='font-family:\"";
                                                                                                                        object3 = "\";'>";
                                                                                                                        object23 = cP.a(object6, (String)object23, (String)object3);
                                                                                                                        break block77;
                                                                                                                    } else {
                                                                                                                        object9 = 0;
                                                                                                                        object23 = null;
                                                                                                                        f6 = 0.0f;
                                                                                                                    }
                                                                                                                    break block77;
                                                                                                                }
                                                                                                                object9 = object30 instanceof StyleSpan;
                                                                                                                if (object9 == 0) break block104;
                                                                                                                object23 = object30;
                                                                                                                object23 = (StyleSpan)object30;
                                                                                                                object9 = object23.getStyle();
                                                                                                                if (object9 == (object7 = 1)) break block105;
                                                                                                                object7 = 2;
                                                                                                                if (object9 == object7) break block106;
                                                                                                                object7 = 3;
                                                                                                                if (object9 != object7) break block107;
                                                                                                                object23 = "<b><i>";
                                                                                                                break block77;
                                                                                                            }
                                                                                                            object23 = "<i>";
                                                                                                            break block77;
                                                                                                        }
                                                                                                        object23 = "<b>";
                                                                                                        break block77;
                                                                                                    }
                                                                                                    object9 = object30 instanceof MQ2;
                                                                                                    if (object9 == 0) break block108;
                                                                                                    object23 = object30;
                                                                                                    object23 = (MQ2)object30;
                                                                                                    object9 = ((MQ2)object23).b;
                                                                                                    object7 = -1;
                                                                                                    if (object9 == object7) break block109;
                                                                                                    object7 = 1;
                                                                                                    if (object9 == object7) break block110;
                                                                                                    object7 = 2;
                                                                                                    if (object9 != object7) break block107;
                                                                                                    object23 = "<ruby style='ruby-position:under;'>";
                                                                                                    break block77;
                                                                                                }
                                                                                                object23 = "<ruby style='ruby-position:over;'>";
                                                                                                break block77;
                                                                                            }
                                                                                            object23 = "<ruby style='ruby-position:unset;'>";
                                                                                            break block77;
                                                                                        }
                                                                                        object9 = object30 instanceof UnderlineSpan;
                                                                                        if (object9 == 0) break block111;
                                                                                        object23 = "<u>";
                                                                                    }
                                                                                    f23 = f7;
                                                                                }
                                                                                void var62_98 = var39_40;
                                                                                break block96;
                                                                            }
                                                                            object9 = object30 instanceof vj3_0;
                                                                            if (object9 == 0) break block107;
                                                                            object23 = object30;
                                                                            object23 = (vj3_0)object30;
                                                                            object7 = ((vj3_0)object23).a;
                                                                            object3 = new StringBuilder();
                                                                            f23 = f7;
                                                                            object11 = ((vj3_0)object23).b;
                                                                            void var62_100 = var39_40;
                                                                            object31 = 1;
                                                                            f15 = Float.MIN_VALUE;
                                                                            if (object11 == object31) break block112;
                                                                            object31 = 2;
                                                                            f15 = 2.8E-45f;
                                                                            if (object11 == object31) break block113;
                                                                            break block114;
                                                                        }
                                                                        f23 = f7;
                                                                        void var62_99 = var39_40;
                                                                        object9 = 0;
                                                                        object23 = null;
                                                                        f6 = 0.0f;
                                                                        break block96;
                                                                    }
                                                                    object10 = "open ";
                                                                    ((StringBuilder)object3).append((String)object10);
                                                                    break block114;
                                                                }
                                                                object31 = 2;
                                                                f15 = 2.8E-45f;
                                                                object10 = "filled ";
                                                                ((StringBuilder)object3).append((String)object10);
                                                            }
                                                            if (object7 == 0) break block115;
                                                            object11 = 1;
                                                            f7 = Float.MIN_VALUE;
                                                            if (object7 == object11) break block116;
                                                            if (object7 != object31) {
                                                                object11 = 3;
                                                                f7 = 4.2E-45f;
                                                                if (object7 != object11) {
                                                                    ((StringBuilder)object3).append(string2);
                                                                    break block78;
                                                                } else {
                                                                    object10 = "sesame";
                                                                    ((StringBuilder)object3).append((String)object10);
                                                                }
                                                                break block78;
                                                            } else {
                                                                object10 = "dot";
                                                                ((StringBuilder)object3).append((String)object10);
                                                            }
                                                            break block78;
                                                        }
                                                        object10 = "circle";
                                                        ((StringBuilder)object3).append((String)object10);
                                                        break block78;
                                                    }
                                                    object10 = "none";
                                                    ((StringBuilder)object3).append((String)object10);
                                                }
                                                object10 = ((StringBuilder)object3).toString();
                                                object9 = ((vj3_0)object23).c;
                                                object7 = 2;
                                                object23 = object9 != object7 ? "over right" : "under left";
                                                object3 = new Object[object7];
                                                object7 = 0;
                                                object6 = null;
                                                object3[0] = object10;
                                                f7 = Float.MIN_VALUE;
                                                object3[1] = object23;
                                                object11 = gz3.a;
                                                object23 = object10 = String.format(Locale.US, "<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", (Object[])object3);
                                            }
                                            if (object27 != 0 || (object27 = object30 instanceof ForegroundColorSpan) != 0 || (object27 = object30 instanceof BackgroundColorSpan) != 0 || (object27 = object30 instanceof u91) != 0 || (object27 = object30 instanceof AbsoluteSizeSpan) != 0 || (object27 = object30 instanceof RelativeSizeSpan) != 0 || (object27 = object30 instanceof vj3_0) != 0) break block117;
                                            object27 = object30 instanceof TypefaceSpan;
                                            if (object27 == 0) break block118;
                                            object24 = object30;
                                            object24 = ((TypefaceSpan)object30).getFamily();
                                            if (object24 != null) {
                                                string19 = string5;
                                            }
                                            break block119;
                                        }
                                        object27 = object30 instanceof StyleSpan;
                                        if (object27 == 0) break block120;
                                        object24 = object30;
                                        object24 = (StyleSpan)object30;
                                        object27 = object24.getStyle();
                                        object11 = 1;
                                        f7 = Float.MIN_VALUE;
                                        if (object27 == object11) break block121;
                                        object11 = 2;
                                        f7 = 2.8E-45f;
                                        if (object27 != object11) {
                                            object11 = 3;
                                            f7 = 4.2E-45f;
                                            if (object27 == object11) {
                                                string19 = "</i></b>";
                                            }
                                            break block119;
                                        } else {
                                            string19 = "</i>";
                                        }
                                        break block119;
                                    }
                                    string19 = "</b>";
                                    break block119;
                                }
                                object27 = object30 instanceof MQ2;
                                if (object27 != 0) {
                                    object24 = object30;
                                    object24 = (MQ2)object30;
                                    object6 = "<rt>";
                                    object10 = new StringBuilder((String)object6);
                                    object24 = androidx.media3.ui.a.a(((MQ2)object24).a);
                                    ((StringBuilder)object10).append((String)object24);
                                    object24 = "</rt></ruby>";
                                    ((StringBuilder)object10).append((String)object24);
                                    string19 = ((StringBuilder)object10).toString();
                                } else {
                                    object27 = object30 instanceof UnderlineSpan;
                                    if (object27 != 0) {
                                        string19 = "</u>";
                                    }
                                }
                            }
                            object24 = string19;
                            break block122;
                        }
                        object24 = string5;
                    }
                    object11 = object25.getSpanStart(object30);
                    object7 = object25.getSpanEnd(object30);
                    if (object23 != null) {
                        object24.getClass();
                        object30 = new a$b((int)object11, (int)object7, (String)object23, (String)object24);
                        object24 = (a$c)object26.get(object11);
                        if (object24 == null) {
                            object24 = new a$c();
                            object26.put(object11, object24);
                        }
                        ((a$c)object24).a.add(object30);
                        object24 = (a$c)object26.get(object7);
                        if (object24 == null) {
                            object24 = new a$c();
                            object26.put(object7, object24);
                        }
                        object24 = ((a$c)object24).b;
                        ((ArrayList)object24).add(object30);
                    }
                    object27 = 1;
                    f8 = Float.MIN_VALUE;
                    object24 = object42;
                    object9 = object41;
                    object6 = object18;
                    object3 = objectArray;
                    f7 = f23;
                    void var39_57 = var62_101;
                }
                object18 = object6;
                objectArray = object3;
                void var62_102 = var39_40;
                object11 = object25.length();
                object24 = new StringBuilder((int)object11);
                f7 = 0.0f;
                object10 = null;
                object9 = 0;
                f6 = 0.0f;
                object23 = null;
                for (object11 = 0; object11 < (object19 = object26.size()); object11 += object7) {
                    object19 = object26.keyAt(object11);
                    object23 = androidx.media3.ui.a.a(object25.subSequence((int)object9, (int)object19));
                    ((StringBuilder)object24).append((String)object23);
                    object23 = (a$c)object26.get(object19);
                    object6 = ((a$c)object23).b;
                    object30 = a$b.f;
                    Collections.sort(object6, object30);
                    object6 = ((a$c)object23).b.iterator();
                    while ((object5 = (Object)object6.hasNext()) != 0) {
                        object30 = ((a$b)object6.next()).d;
                        ((StringBuilder)object24).append((String)object30);
                    }
                    object23 = ((a$c)object23).a;
                    object6 = a$b.e;
                    Collections.sort(object23, object6);
                    object23 = ((ArrayList)object23).iterator();
                    while ((object7 = (Object)object23.hasNext()) != 0) {
                        object6 = ((a$b)object23.next()).c;
                        ((StringBuilder)object24).append((String)object6);
                    }
                    object7 = 1;
                    object9 = object19;
                }
                object13 = object25.length();
                object26 = androidx.media3.ui.a.a(object25.subSequence((int)object9, (int)object13));
                ((StringBuilder)object24).append((String)object26);
                object26 = ((StringBuilder)object24).toString();
                object25 = new a$a((String)object26, (Map)object14);
            }
            object14 = hashMap.keySet().iterator();
            while ((object13 = (Object)object14.hasNext()) != 0) {
                object26 = (String)object14.next();
                object24 = (String)hashMap.get(object26);
                if ((object24 = (String)hashMap.put((Object[])object26, object24)) != null && (object13 = ((String)object24).equals(object26 = hashMap.get(object26))) == 0) {
                    object13 = 0;
                    f11 = 0.0f;
                    object26 = null;
                } else {
                    object13 = 1;
                    f11 = Float.MIN_VALUE;
                }
                ct3.f((boolean)object13);
            }
            object14 = object16;
            object26 = Float.valueOf(f12);
            object24 = (int)object29;
            object10 = object28;
            f6 = ((Pe0)object).q;
            float f24 = f6 - 0.0f;
            object19 = f24 == 0.0f ? 0 : (f24 > 0.0f ? 1 : -1);
            if (object19 != 0) {
                object19 = object17;
                object7 = 2;
                object5 = 1;
                f5 = Float.MIN_VALUE;
                object8 = object17 != object7 && object17 != object5 ? "skewX" : "skewY";
                object23 = Float.valueOf(f6);
                object3 = new Object[object7];
                object7 = 0;
                object6 = null;
                object3[0] = object8;
                object3[object5] = object23;
                object9 = gz3.a;
                object23 = Locale.US;
                object8 = String.format((Locale)object23, "%s(%.2fdeg)", (Object[])object3);
            } else {
                object8 = object20;
            }
            object9 = 14;
            f6 = 2.0E-44f;
            object23 = new Object[object9];
            object6 = null;
            object23[0] = object14;
            object23[1] = string7;
            object23[2] = object26;
            object21 = 3;
            object23[object21] = string8;
            object13 = 4;
            f11 = 5.6E-45f;
            object23[object13] = objectArray2;
            object23[5] = iterator;
            object23[6] = var55_79;
            object23[7] = var57_85;
            object23[8] = string4;
            object23[9] = charSequence;
            object23[10] = string6;
            object7 = 11;
            object23[object7] = object24;
            object23[12] = object10;
            object27 = 13;
            f8 = 1.8E-44f;
            object23[object27] = object8;
            object24 = String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", (Object[])object23);
            object10 = stringBuilder;
            stringBuilder.append((String)object24);
            stringBuilder.append("<span class='default_bg'>");
            object25 = ((a$a)object25).a;
            object24 = ((Pe0)object).c;
            if (object24 != null) {
                void var62_94;
                object23 = WebViewSubtitleOutput$b.a;
                Object object27 = ((Enum)object24).ordinal();
                object27 = object23[object27];
                object9 = 1;
                f6 = Float.MIN_VALUE;
                if (object27 != object9) {
                    void var43_61;
                    object9 = 2;
                    f6 = 2.8E-45f;
                    object24 = object27 != object9 ? string9 : var43_61;
                } else {
                    object9 = 2;
                    f6 = 2.8E-45f;
                    object24 = object22;
                }
                object6 = "<span style='display:inline-block; text-align:";
                object8 = new StringBuilder((String)object6);
                ((StringBuilder)object8).append((String)object24);
                object24 = var62_94;
                ((StringBuilder)object8).append((String)var62_94);
                object24 = ((StringBuilder)object8).toString();
                ((StringBuilder)object10).append((String)object24);
                ((StringBuilder)object10).append((String)object25);
                object25 = string5;
                ((StringBuilder)object10).append(string5);
            } else {
                object9 = 2;
                f6 = 2.8E-45f;
                stringBuilder.append((String)object25);
            }
            object25 = "</span></div>";
            ((StringBuilder)object10).append((String)object25);
            ++object16;
            object12 = 3;
            object27 = 2;
            f8 = 2.8E-45f;
            object9 = 1;
            f6 = Float.MIN_VALUE;
            object5 = 1067030938;
            f5 = 1.2f;
            object14 = this;
            object8 = object10;
            object6 = object18;
            object3 = objectArray;
            object11 = 0;
            f7 = 0.0f;
            object10 = null;
        }
    }

    public final void onLayout(boolean bl2, int n3, int n4, int n7, int n8) {
        List list;
        super.onLayout(bl2, n3, n4, n7, n8);
        if (bl2 && !(bl2 = (list = this.c).isEmpty())) {
            this.c();
        }
    }
}

