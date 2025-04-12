/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.text.SpannableStringBuilder
 *  android.text.style.BackgroundColorSpan
 *  android.text.style.ForegroundColorSpan
 *  android.text.style.UnderlineSpan
 *  android.view.LayoutInflater
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem$OnMenuItemClickListener
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.SearchView$k;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.D;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import com.chuckerteam.chucker.R$color;
import com.chuckerteam.chucker.R$id;
import com.chuckerteam.chucker.R$layout;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlin.text.b;

/*
 * Renamed from Aq3
 */
public final class aq3_0
extends Fragment
implements SearchView$k {
    public final D a;
    public final rq1_2 b;
    public final I3 c;
    public yU d;
    public final iq3 e;
    public int f;
    public int g;

    public aq3_0() {
        Object object = Reflection.getOrCreateKotlinClass(Hq3.class);
        Object object2 = new Aq3$c(this);
        Lambda lambda = Aq3$e.c;
        if (lambda == null) {
            super(this);
        }
        jw0_0 jw0_02 = new jw0_0(this, 0);
        this.a = object = LW0.a(this, (yn1_2)object, (Function0)object2, jw0_02, lambda);
        object = et1_2.NONE;
        super(this);
        object = yr1_2.a((et1_2)((Object)object), (Function0)object2);
        this.b = object;
        object = new y3();
        object2 = new zq3_0(this);
        object = this.registerForActivityResult((x3)object, (w3)object2);
        Intrinsics.checkNotNullExpressionValue(object, "registerForActivityResult(ActivityResultContracts.CreateDocument()) { uri ->\n        val transaction = viewModel.transaction.value\n        if (uri != null && transaction != null) {\n            lifecycleScope.launch {\n                val result = saveToFile(payloadType, uri, transaction)\n                val toastMessageId = if (result) {\n                    R.string.chucker_file_saved\n                } else {\n                    R.string.chucker_file_not_saved\n                }\n                Toast.makeText(context, toastMessageId, Toast.LENGTH_SHORT).show()\n            }\n        } else {\n            Toast.makeText(\n                requireContext(),\n                R.string.chucker_save_failed_to_open_document,\n                Toast.LENGTH_SHORT\n            ).show()\n        }\n    }");
        this.c = object;
        object = new iq3();
        this.e = object;
        this.f = -256;
        this.g = -65536;
    }

    public final boolean L1(String string2) {
        Intrinsics.checkNotNullParameter(string2, "query");
        return false;
    }

    public final zn2 Oa() {
        return (zn2)((Object)this.b.getValue());
    }

    public final void onAttach(Context context) {
        int n3;
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        int n4 = R$color.chucker_background_span_color;
        this.f = n4 = t70.getColor(context, n4);
        n4 = R$color.chucker_foreground_span_color;
        this.g = n3 = t70.getColor(context, n4);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setHasOptionsMenu(true);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onCreateOptionsMenu(Menu var1_1, MenuInflater var2_2) {
        block17: {
            block20: {
                block21: {
                    block18: {
                        block19: {
                            Intrinsics.checkNotNullParameter(var1_1 /* !! */ , "menu");
                            Intrinsics.checkNotNullParameter(var2_2, "inflater");
                            var3_3 = this.a;
                            var4_4 /* !! */  = (HttpTransaction)((Hq3)var3_3.getValue()).f.d();
                            var5_5 /* !! */  = this.Oa();
                            var6_6 = Aq3$a.$EnumSwitchMapping$0;
                            var7_7 = var5_5 /* !! */ .ordinal();
                            var7_7 = var6_6[var7_7];
                            var8_8 = 0L;
                            var10_9 = true;
                            if (var7_7 == var10_9) break block18;
                            var11_10 = 2 != 0;
                            if (var7_7 != var11_10) break block19;
                            if (var4_4 /* !! */  == null || var10_9 != (var7_7 = (boolean)var4_4 /* !! */ .isResponseBodyPlainText()) || (var5_5 /* !! */  = var4_4 /* !! */ .getResponsePayloadSize()) != null && !(var7_7 = (cfr_temp_0 = var8_8 - (var12_11 = var5_5 /* !! */ .longValue())) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1))) break block20;
                            break block21;
                        }
                        var1_1 /* !! */  = new NoWhenBranchMatchedException();
                        throw var1_1 /* !! */ ;
                    }
                    if (var4_4 /* !! */  == null || var10_9 != (var7_7 = (boolean)var4_4 /* !! */ .isRequestBodyPlainText()) || (var5_5 /* !! */  = var4_4 /* !! */ .getRequestPayloadSize()) != null && !(var7_7 = (boolean)((cfr_temp_1 = var8_8 - (var12_12 = var5_5 /* !! */ .longValue())) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)))) break block20;
                }
                var7_7 = R$id.search;
                var5_5 /* !! */  = var1_1 /* !! */ .findItem((int)var7_7);
                var5_5 /* !! */ .setVisible(var10_9);
                var5_5 /* !! */  = var5_5 /* !! */ .getActionView();
                if (var5_5 /* !! */  != null) {
                    var5_5 /* !! */  = (SearchView)var5_5 /* !! */ ;
                    var5_5 /* !! */ .setOnQueryTextListener(this);
                    var5_5 /* !! */ .setIconifiedByDefault(var10_9);
                } else {
                    var1_1 /* !! */  = new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.SearchView");
                    throw var1_1 /* !! */ ;
                }
            }
            if ((var5_5 /* !! */  = this.Oa()) == (var14_13 = zn2.REQUEST)) {
                if (var4_4 /* !! */  == null) {
                    var15_14 = 0;
                    var4_4 /* !! */  = null;
                } else {
                    var5_5 /* !! */  = Long.valueOf(var8_8);
                    var4_4 /* !! */  = var4_4 /* !! */ .getRequestPayloadSize();
                    var15_14 = Intrinsics.areEqual((Object)var5_5 /* !! */ , var4_4 /* !! */ );
                }
                if (var15_14 == 0) lbl-1000:
                // 3 sources

                {
                    while (true) {
                        var15_14 = 1;
                        break block17;
                        break;
                    }
                }
lbl47:
                // 3 sources

                while (true) {
                    var15_14 = 0;
                    var4_4 /* !! */  = null;
                    break block17;
                    break;
                }
            }
            var5_5 /* !! */  = this.Oa();
            if (var5_5 /* !! */  != (var16_15 = zn2.RESPONSE)) ** GOTO lbl-1000
            if (var4_4 /* !! */  == null) {
                var15_14 = 0;
                var4_4 /* !! */  = null;
            } else {
                var5_5 /* !! */  = Long.valueOf(var8_8);
                var4_4 /* !! */  = var4_4 /* !! */ .getResponsePayloadSize();
                var15_14 = (int)Intrinsics.areEqual((Object)var5_5 /* !! */ , var4_4 /* !! */ );
            }
            ** while (var15_14 != 0)
lbl61:
            // 1 sources

            ** while (true)
        }
        if (var15_14 != 0) {
            var15_14 = R$id.save_body;
            var4_4 /* !! */  = var1_1 /* !! */ .findItem(var15_14);
            var4_4 /* !! */ .setVisible(var10_9);
            var5_5 /* !! */  = new xq3(this);
            var4_4 /* !! */ .setOnMenuItemClickListener((MenuItem.OnMenuItemClickListener)var5_5 /* !! */ );
        }
        if ((var4_4 /* !! */  = this.Oa()) == var14_13) {
            var3_3 = ((Hq3)var3_3.getValue()).e;
            var4_4 /* !! */  = this.getViewLifecycleOwner();
            var5_5 /* !! */  = new yq3_0(var1_1 /* !! */ );
            var3_3.e((mu1_1)var4_4 /* !! */ , (F62)var5_5 /* !! */ );
        } else {
            var17_16 = R$id.encode_url;
            var3_3 = var1_1 /* !! */ .findItem(var17_16);
            var3_3.setVisible(false);
        }
        super.onCreateOptionsMenu(var1_1 /* !! */ , var2_2);
    }

    public final View onCreateView(LayoutInflater object, ViewGroup object2, Bundle object3) {
        object3 = "inflater";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        int n3 = R$layout.chucker_fragment_transaction_payload;
        object = yU.bind(object.inflate(n3, object2, false));
        object2 = "inflate(\n            inflater,\n            container,\n            false\n        )";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        this.d = object;
        if (object != null) {
            return object.a;
        }
        Intrinsics.throwUninitializedPropertyAccessException("payloadBinding");
        throw null;
    }

    public final void onViewCreated(View object, Bundle object2) {
        Object object3 = "view";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        super.onViewCreated((View)object, (Bundle)object2);
        object = this.d;
        if (object != null) {
            object = ((yU)object).e;
            ((RecyclerView)object).setHasFixedSize(true);
            object2 = this.e;
            ((RecyclerView)object).setAdapter((RecyclerView$f)object2);
            object = this.a;
            object2 = ((Hq3)((D)object).getValue()).f;
            object = ((Hq3)((D)object).getValue()).g;
            Intrinsics.checkNotNullParameter(object2, "<this>");
            Intrinsics.checkNotNullParameter(object, "other");
            object3 = ev1_0.c;
            object = ft0.a((LiveData)object2, (zr1_1)object, (Function2)object3);
            object2 = this.getViewLifecycleOwner();
            object3 = new wq3_0(this);
            ((LiveData)object).e((mu1_1)object2, (F62)object3);
            return;
        }
        Intrinsics.throwUninitializedPropertyAccessException("payloadBinding");
        throw null;
    }

    public final void q1(String string2) {
        Object object = this;
        Object object2 = string2;
        Object object3 = "newText";
        Intrinsics.checkNotNullParameter(string2, (String)object3);
        int n3 = kotlin.text.b.k(string2);
        int n4 = 1;
        n3 ^= n4;
        Object object4 = "iteratorFactory";
        String string3 = "<this>";
        String string4 = "spans";
        Class<Object> clazz = Object.class;
        int n7 = 0;
        Integer n8 = null;
        iq3 iq32 = this.e;
        if (n3 != 0 && (n3 = string2.length()) > n4) {
            int n10;
            int n14;
            Object object5;
            boolean bl2;
            n3 = this.f;
            int n15 = this.g;
            iq32.getClass();
            Intrinsics.checkNotNullParameter(string2, (String)object3);
            object3 = iq32.a;
            Object object6 = new ArrayList();
            object3 = ((ArrayList)object3).iterator();
            while (bl2 = object3.hasNext()) {
                object5 = object3.next();
                n14 = object5 instanceof Fq3$a;
                if (n14 == 0) continue;
                ((ArrayList)object6).add(object5);
            }
            Intrinsics.checkNotNullParameter(object6, string3);
            object3 = new hx_2((ArrayList)object6);
            Intrinsics.checkNotNullParameter(object3, (String)object4);
            object3 = (Iterator)object3.invoke();
            object4 = new kg1_2((Iterator)object3);
            while ((n10 = (object3 = ((kg1_2)object4).a).hasNext()) != 0) {
                int n16;
                int n17;
                UnderlineSpan underlineSpan;
                object3 = (IndexedValue)((kg1_2)object4).next();
                object6 = (Fq3$a)((IndexedValue)object3).b;
                object5 = ((Fq3$a)object6).a;
                bl2 = StringsKt.F(object5, (CharSequence)object2, n4 != 0);
                n10 = ((IndexedValue)object3).a;
                if (bl2) {
                    ((Fq3$a)object6).a.clearSpans();
                    object5 = ((Fq3$a)object6).a.toString();
                    Intrinsics.checkNotNullExpressionValue(object5, "item.line.toString()");
                    Intrinsics.checkNotNullParameter(object5, string3);
                    Intrinsics.checkNotNullParameter(object2, "search");
                    Serializable serializable = new ArrayList();
                    int n18 = StringsKt.L(0, object5, (String)object2, n4 != 0);
                    while (n18 >= 0) {
                        n8 = n18;
                        ((ArrayList)serializable).add(n8);
                        n18 = StringsKt.L(n18 + 1, object5, (String)object2, n4 != 0);
                        n7 = 0;
                        n8 = null;
                    }
                    n7 = string2.length();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(object5);
                    object5 = ((ArrayList)serializable).iterator();
                    while ((n14 = object5.hasNext()) != 0) {
                        serializable = (Number)object5.next();
                        n14 = ((Number)serializable).intValue();
                        underlineSpan = new UnderlineSpan();
                        n17 = n14 + n7;
                        n16 = 33;
                        spannableStringBuilder.setSpan((Object)underlineSpan, n14, n17, n16);
                        underlineSpan = new ForegroundColorSpan(n15);
                        spannableStringBuilder.setSpan((Object)underlineSpan, n14, n17, n16);
                        underlineSpan = new BackgroundColorSpan(n3);
                        spannableStringBuilder.setSpan((Object)underlineSpan, n14, n17, n16);
                        object = this;
                        object2 = string2;
                        n4 = 1;
                    }
                    object = "<set-?>";
                    Intrinsics.checkNotNullParameter(spannableStringBuilder, (String)object);
                    ((Fq3$a)object6).a = spannableStringBuilder;
                    iq32.notifyItemChanged(++n10);
                } else {
                    object = ((Fq3$a)object6).a;
                    n16 = object.length() + -1;
                    n4 = 0;
                    underlineSpan = null;
                    object = object.getSpans(0, n16, clazz);
                    Intrinsics.checkNotNullExpressionValue(object, string4);
                    n17 = ((Object[])object).length;
                    if (n17 == 0) {
                        n17 = 1;
                    } else {
                        n17 = 0;
                        object = null;
                    }
                    if ((n17 ^= 1) != 0) {
                        object = ((Fq3$a)object6).a;
                        object.clearSpans();
                        iq32.notifyItemChanged(++n10);
                    }
                }
                object = this;
                object2 = string2;
                n4 = 1;
                n7 = 0;
                n8 = null;
            }
        } else {
            int n19;
            boolean bl3;
            object = iq32.a;
            object2 = new ArrayList();
            object = object.iterator();
            while (bl3 = object.hasNext()) {
                object3 = object.next();
                n3 = object3 instanceof Fq3$a;
                if (n3 == 0) continue;
                ((ArrayList)object2).add(object3);
            }
            Intrinsics.checkNotNullParameter(object2, string3);
            object = new hx_2((ArrayList)object2);
            Intrinsics.checkNotNullParameter(object, (String)object4);
            object = (Iterator)object.invoke();
            object2 = new kg1_2((Iterator)object);
            while ((n19 = (object = ((kg1_2)object2).a).hasNext()) != 0) {
                object = (IndexedValue)((kg1_2)object2).next();
                object3 = (Fq3$a)object.b;
                Object[] objectArray = ((Fq3$a)object3).a;
                n4 = objectArray.length() + -1;
                object4 = null;
                objectArray = objectArray.getSpans(0, n4, clazz);
                Intrinsics.checkNotNullExpressionValue(objectArray, string4);
                n3 = objectArray.length;
                if (n3 == 0) {
                    n3 = 1;
                } else {
                    n3 = 0;
                    objectArray = null;
                }
                if ((n3 ^= 1) == 0) continue;
                object3 = ((Fq3$a)object3).a;
                object3.clearSpans();
                n19 = object.a + 1;
                iq32.notifyItemChanged(n19);
            }
        }
    }
}

