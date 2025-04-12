/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  android.view.View
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.services.data.Product.CategoryTags;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.SaleGAData;
import com.ril.ajio.services.data.Product.Tag;
import com.ril.ajio.services.data.Product.TagPrimary;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class kG1
extends RecyclerView$B
implements Oj2 {
    public static final kG1$a Companion;
    public ArrayList A;
    public int B;
    public final Context a;
    public final M82 b;
    public final Cw2 c;
    public final boolean d;
    public final Yj2 e;
    public final AjioTextView f;
    public final AjioTextView g;
    public final ImageView h;
    public final AjioTextView i;
    public final View j;
    public final TextView k;
    public final View l;
    public final TextView m;
    public final RecyclerView n;
    public final AjioTextView o;
    public final AjioTextView p;
    public final RecyclerView q;
    public final View r;
    public final ConstraintLayout s;
    public final TextView t;
    public final ImageView u;
    public final TextView v;
    public final LinearLayout w;
    public final hh3_2 x;
    public final boolean y;
    public Product z;

    static {
        kG1$a kG1$a;
        Companion = kG1$a = new Object();
    }

    public /* synthetic */ kG1(View view, Context context, M82 m82, Cw2 cw2, boolean bl2) {
        Yj2 yj2 = Yj2.GRID;
        this(view, context, m82, cw2, bl2, yj2);
    }

    public kG1(View object, Context object2, M82 object3, Cw2 cw2, boolean bl2, Yj2 yj2) {
        boolean bl3;
        Intrinsics.checkNotNullParameter(object, "itemView");
        Intrinsics.checkNotNullParameter(object2, "context");
        Intrinsics.checkNotNullParameter(object3, "onPLPProductClickListener");
        Intrinsics.checkNotNullParameter((Object)yj2, "plpViewType");
        super((View)object);
        this.a = object2;
        this.b = object3;
        this.c = cw2;
        this.d = bl2;
        this.e = yj2;
        int n3 = R$id.luxe_plp_row_prd_name_tv;
        object2 = object.findViewById(n3);
        object3 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        object2 = (AjioTextView)object2;
        this.f = object2;
        n3 = R$id.luxe_plp_row_brand_tv;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        object2 = (AjioTextView)object2;
        this.g = object2;
        n3 = R$id.luxe_plp_row_product_rv;
        object2 = (ImageView)object.findViewById(n3);
        this.h = object2;
        n3 = R$id.luxe_plp_row_add_to_closet_wishlistcount_iv;
        object2 = (AjioTextView)object.findViewById(n3);
        this.i = object2;
        n3 = R$id.luxe_plp_row_add_to_closet_iv;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        this.j = object2;
        n3 = R$id.selling_fast_tag;
        object2 = (TextView)object.findViewById(n3);
        this.k = object2;
        n3 = R$id.luxe_plp_row_added_to_closet_iv;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        this.l = object2;
        n3 = R$id.luxe_plp_row_added_to_closet_wishcount_iv;
        object2 = (TextView)object.findViewById(n3);
        this.m = object2;
        n3 = R$id.luxe_plp_row_price_rv;
        object2 = (RecyclerView)object.findViewById(n3);
        this.n = object2;
        n3 = R$id.luxe_plp_row_exclusive_tv;
        object2 = (AjioTextView)object.findViewById(n3);
        this.o = object2;
        n3 = R$id.luxe_plp_ad_tv;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        object2 = (AjioTextView)object2;
        this.p = object2;
        n3 = R$id.luxe_plp_row_product_recycler;
        object2 = (RecyclerView)object.findViewById(n3);
        this.q = object2;
        n3 = R$id.sale_container;
        object2 = object.findViewById(n3);
        this.r = object2;
        n3 = R$id.freebie_lyt;
        object2 = (ConstraintLayout)object.findViewById(n3);
        this.s = object2;
        n3 = R$id.freebies_text;
        object2 = (TextView)object.findViewById(n3);
        this.t = object2;
        n3 = R$id.freebieIcon;
        object2 = (ImageView)object.findViewById(n3);
        this.u = object2;
        n3 = R$id.priority_date;
        object2 = (TextView)object.findViewById(n3);
        this.v = object2;
        n3 = R$id.ll_pd_delivery;
        object = (LinearLayout)object.findViewById(n3);
        this.w = object;
        super(this);
        object = yr1_2.b((Function0)object);
        this.x = object;
        object = el1_2.a;
        this.y = bl3 = el1_2.l();
        super();
        this.A = object;
    }

    public final void g() {
        Product product = this.z;
        if (product != null) {
            this.x(product);
        }
    }

    public final void n(int n3) {
        int n4;
        Serializable serializable;
        Cw2 cw2 = this.c;
        if (cw2 != null && (serializable = this.z) != null && (n4 = ((ArrayList)(serializable = this.A)).size()) > 0) {
            Product product = this.z;
            Intrinsics.checkNotNull(product);
            Object object = this.A.get(n3);
            String string2 = "get(...)";
            Intrinsics.checkNotNullExpressionValue(object, string2);
            object = (String)object;
            int n7 = this.getLayoutPosition();
            serializable = new lv2(product, n7, (String)object);
            cw2.L((lv2)serializable);
        }
    }

    public final Pair w(Product object) {
        Serializable serializable = (Boolean)this.x.getValue();
        boolean bl2 = (Boolean)serializable;
        String string2 = null;
        if (bl2 && object != null && (object = ((Product)object).getTags()) != null && (object = ((Tag)object).getCategoryTags()) != null) {
            object = ((Iterable)object).iterator();
            while (bl2 = object.hasNext()) {
                boolean bl3;
                String string3;
                boolean bl4;
                Object object2;
                serializable = (CategoryTags)object.next();
                if (serializable == null || (object2 = ((CategoryTags)serializable).getCategory()) == null || (bl4 = ((String)object2).equalsIgnoreCase(string3 = "SELLING_POINT")) != (bl3 = true)) continue;
                object2 = Boolean.TRUE;
                if ((serializable = ((CategoryTags)serializable).getPrimary()) != null) {
                    string2 = ((TagPrimary)serializable).getValue();
                }
                object = new Pair(object2, string2);
                return object;
            }
        }
        serializable = Boolean.FALSE;
        object = new Pair(serializable, null);
        return object;
    }

    /*
     * Unable to fully structure code
     */
    public final void x(Product var1_1) {
        var2_2 = var1_1.getWasPriceData();
        var3_3 = null;
        if (var2_2 != null) {
            var2_2 = var1_1.getWasPriceData();
            if (var2_2 != null) {
                var2_2 = var2_2.getValue();
            } else {
                var4_4 = false;
                var2_2 = null;
                var5_5 = 0.0f;
            }
            var4_4 = TextUtils.isEmpty((CharSequence)var2_2);
            if (!var4_4) {
                var2_2 = var1_1.getWasPriceData();
                if (var2_2 != null && (var2_2 = var2_2.getValue()) != null) {
                    var5_5 = Float.parseFloat((String)var2_2);
                    var2_2 = Float.valueOf(var5_5);
                } else {
                    var4_4 = false;
                    var2_2 = null;
                    var5_5 = 0.0f;
                }
                Intrinsics.checkNotNull(var2_2);
                var2_2.floatValue();
            }
        }
        var2_2 = var1_1.getPrice();
        var6_6 = 0;
        var7_7 = null;
        if (var2_2 == null) ** GOTO lbl-1000
        var2_2 = var1_1.getPrice();
        if (var2_2 != null) {
            var2_2 = var2_2.getValue();
        } else {
            var4_4 = false;
            var2_2 = null;
            var5_5 = 0.0f;
        }
        var4_4 = TextUtils.isEmpty((CharSequence)var2_2);
        if (!var4_4) {
            var2_2 = var1_1.getPrice();
            if (var2_2 != null && (var2_2 = var2_2.getValue()) != null) {
                var5_5 = Float.parseFloat((String)var2_2);
                var2_2 = Float.valueOf(var5_5);
            } else {
                var4_4 = false;
                var2_2 = null;
                var5_5 = 0.0f;
            }
            Intrinsics.checkNotNull(var2_2);
            var5_5 = var2_2.floatValue();
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = false;
            var5_5 = 0.0f;
            var2_2 = null;
        }
        var8_8 = true;
        var9_9 = tr2_2.p(var8_8);
        if (var9_9) {
            var11_11 = var1_1.getOfferPrice();
            if (var11_11 != null && (var11_11 = var11_11.getPriceReveal()) != null && (var11_11 = var11_11.getBestPrice()) != null) {
                var12_12 = var11_11.floatValue();
            } else {
                var12_12 = 0.0f;
                var11_11 = null;
            }
            var6_6 = (cfr_temp_0 = var12_12 - 0.0f) == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
            if (var6_6 <= 0) {
                var8_8 = false;
            }
            var7_7 = var1_1.getOfferPrice();
            if (var7_7 != null && (var7_7 = var7_7.getPriceReveal()) != null && (var7_7 = var7_7.getBestPrice()) != null) {
                var7_7 = var7_7.toString();
            } else {
                var6_6 = 0;
                var7_7 = null;
            }
            var11_11 = var1_1.getOfferPrice();
            if (var11_11 != null && (var11_11 = var11_11.getPriceReveal()) != null) {
                var11_11 = var11_11.getDiscountPercent();
            } else {
                var11_11 = null;
                var12_12 = 0.0f;
            }
            var13_13 = var10_10 = new SaleGAData(var8_8, (String)var7_7, (String)var11_11);
        } else {
            var13_13 = null;
        }
        var7_7 = var1_1.getFnlColorVariantData();
        if (var7_7 != null) {
            var3_3 = var7_7.getColorGroup();
        }
        var14_14 = this.getAdapterPosition();
        var15_15 = String.valueOf(var5_5);
        this.b.S6(var3_3, var14_14, var1_1, var15_15, var13_13, null);
    }

    /*
     * Exception decompiling
     */
    public final void y(Product var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Statement already marked as first in another block
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.markFirstStatementInBlock(Op03SimpleStatement.java:461)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.markWholeBlock(Misc.java:251)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.considerAsSimpleIf(ConditionalRewriter.java:673)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.identifyNonjumpingConditionals(ConditionalRewriter.java:56)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:760)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }
}

