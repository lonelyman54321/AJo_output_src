/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.text.SpannableStringBuilder
 *  android.text.Spanned
 */
import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import com.chuckerteam.chucker.R$string;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

/*
 * Renamed from Cq3
 */
public final class cq3_0
extends qg3_2
implements Function2 {
    public ArrayList a;
    public Bitmap b;
    public int c;
    public final /* synthetic */ zn2 d;
    public final /* synthetic */ HttpTransaction e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ aq3_0 g;

    public cq3_0(zn2 zn22, HttpTransaction httpTransaction, boolean bl2, aq3_0 aq3_02, f80_0 f80_02) {
        this.d = zn22;
        this.e = httpTransaction;
        this.f = bl2;
        this.g = aq3_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        boolean bl2 = this.f;
        aq3_0 aq3_02 = this.g;
        zn2 zn22 = this.d;
        HttpTransaction httpTransaction = this.e;
        object = new cq3_0(zn22, httpTransaction, bl2, aq3_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (cq3_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((cq3_0)object).invokeSuspend(object2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        String string2;
        boolean bl2;
        ArrayList arrayList;
        int n3;
        Object object2;
        block17: {
            void var1_11;
            Object object3;
            block14: {
                void var1_6;
                HttpTransaction httpTransaction;
                zn2 zn22;
                block16: {
                    block15: {
                        block13: {
                            object2 = j90_0.COROUTINE_SUSPENDED;
                            int n4 = this.c;
                            n3 = 1;
                            if (n4 == 0) break block13;
                            if (n4 != n3) {
                                IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                throw illegalStateException;
                            }
                            object2 = this.b;
                            arrayList = this.a;
                            vl2_2.b(object);
                            break block14;
                        }
                        vl2_2.b(object);
                        arrayList = new ArrayList();
                        zn2 zn23 = zn2.REQUEST;
                        zn22 = this.d;
                        httpTransaction = this.e;
                        if (zn22 != zn23) break block15;
                        String string3 = httpTransaction.getRequestHeadersString(n3 != 0);
                        bl2 = httpTransaction.isRequestBodyPlainText();
                        boolean bl3 = this.f;
                        if (bl3) {
                            string2 = httpTransaction.getFormattedRequestBody();
                            break block16;
                        } else {
                            string2 = httpTransaction.getRequestBody();
                            if (string2 == null) {
                                string2 = "";
                            }
                        }
                        break block16;
                    }
                    String string4 = httpTransaction.getResponseHeadersString(n3 != 0);
                    bl2 = httpTransaction.isResponseBodyPlainText();
                    string2 = httpTransaction.getFormattedResponseBody();
                }
                boolean bl4 = kotlin.text.b.k((CharSequence)var1_6) ^ n3;
                if (bl4) {
                    Spanned spanned = D91.a(0, (String)var1_6);
                    String string5 = "fromHtml(\n                            headersString,\n                            HtmlCompat.FROM_HTML_MODE_LEGACY\n                        )";
                    Intrinsics.checkNotNullExpressionValue(spanned, string5);
                    Fq3$b fq3$b = new Fq3$b(spanned);
                    arrayList.add(fq3$b);
                }
                Bitmap bitmap = httpTransaction.getResponseImageBitmap();
                zn2 zn24 = zn2.RESPONSE;
                if (zn22 != zn24 || bitmap == null) break block17;
                this.a = arrayList;
                this.b = bitmap;
                this.c = n3;
                object3 = xy_1.a;
                object3 = ir0_2.a;
                Object var7_24 = null;
                wy_1 wy_12 = new wy_1(bitmap, null);
                if ((object3 = Ae3.g(this, (CoroutineContext)object3, wy_12)) == object2) {
                    return object2;
                }
                object2 = bitmap;
                Object object4 = object3;
            }
            Double d2 = (Double)var1_11;
            object3 = new Fq3$c((Bitmap)object2, d2);
            arrayList.add(object3);
            return arrayList;
        }
        String string6 = "valueOf(it)";
        if (!bl2) {
            object2 = this.g.requireContext();
            n3 = R$string.chucker_body_omitted;
            object2 = object2.getString(n3);
            object2 = SpannableStringBuilder.valueOf((CharSequence)object2);
            Intrinsics.checkNotNullExpressionValue(object2, string6);
            Fq3$a fq3$a = new Fq3$a((SpannableStringBuilder)object2);
            arrayList.add(fq3$a);
            return arrayList;
        }
        boolean bl5 = kotlin.text.b.k(string2) ^ n3;
        if (!bl5) return arrayList;
        object2 = ((Iterable)StringsKt.S(string2)).iterator();
        while ((n3 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
            String string7 = (String)object2.next();
            string7 = SpannableStringBuilder.valueOf((CharSequence)string7);
            Intrinsics.checkNotNullExpressionValue(string7, string6);
            Fq3$a fq3$a = new Fq3$a((SpannableStringBuilder)string7);
            arrayList.add(fq3$a);
        }
        return arrayList;
    }
}

