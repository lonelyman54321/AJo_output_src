/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import com.ril.ajio.analytics.handler.OnGAEventHandlerListener;
import com.ril.ajio.services.data.Home.CategoryTextLinkDetails;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from S41
 */
public final class s41_0
extends RecyclerView$B
implements View.OnClickListener {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final r82_0 e;
    public final OnGAEventHandlerListener f;
    public final ImageView g;
    public final View h;
    public final TextView i;
    public final TextView j;
    public final TextView k;
    public final TextView l;
    public final TextView m;
    public int n;

    public s41_0(View view, String string2, String string3, int n3, int n4, r82_0 r82_02) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        Intrinsics.checkNotNullParameter(string2, "title");
        Intrinsics.checkNotNullParameter(string3, "typeCode");
        super(view);
        this.a = string2;
        this.b = string3;
        this.c = n3;
        this.d = n4;
        this.e = r82_02;
        this.f = null;
        int n7 = R$id.sub_row_imv_component;
        string2 = view.findViewById(n7);
        string3 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(string2, string3);
        string2 = (ImageView)string2;
        this.g = string2;
        n7 = R$id.sub_row_layout_click;
        string2 = view.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(string2, string3);
        this.h = string2;
        n3 = R$id.native_feature_hero_tv_1;
        View view2 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view2, string3);
        view2 = (TextView)view2;
        this.i = view2;
        n4 = R$id.native_feature_hero_tv_2;
        View view3 = view.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(view3, string3);
        view3 = (TextView)view3;
        this.j = view3;
        int n8 = R$id.native_feature_hero_tv_3;
        r82_02 = view.findViewById(n8);
        Intrinsics.checkNotNullExpressionValue(r82_02, string3);
        r82_02 = (TextView)r82_02;
        this.k = r82_02;
        int n10 = R$id.native_feature_hero_tv_4;
        View view4 = view.findViewById(n10);
        Intrinsics.checkNotNullExpressionValue(view4, string3);
        view4 = (TextView)view4;
        this.l = view4;
        int n14 = R$id.native_feature_hero_tv_5;
        view = view.findViewById(n14);
        Intrinsics.checkNotNullExpressionValue(view, string3);
        view = (TextView)view;
        this.m = view;
        this.n = -1;
        string2.setOnClickListener((View.OnClickListener)this);
        view2.setOnClickListener((View.OnClickListener)this);
        view3.setOnClickListener((View.OnClickListener)this);
        r82_02.setOnClickListener(this);
        view4.setOnClickListener((View.OnClickListener)this);
        view.setOnClickListener((View.OnClickListener)this);
    }

    public final void onClick(View object) {
        Intrinsics.checkNotNullParameter(object, "v");
        Object object2 = object.getTag();
        boolean bl2 = object2 instanceof hp1_2;
        if (bl2) {
            object = object.getTag();
            Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.home.landingpage.model.LandingItemInfo");
            object = (hp1_2)object;
            object2 = this.e;
            if (object2 != null) {
                object2.La((hp1_2)object);
            }
        }
    }

    public final void w(TextView textView, ArrayList object, int n3) {
        int n4;
        int n7 = 8;
        if (object != null && (n4 = ((ArrayList)object).size()) > n3) {
            Object object2 = ((ArrayList)object).get(n3);
            Intrinsics.checkNotNullExpressionValue(object2, "get(...)");
            object2 = (CategoryTextLinkDetails)object2;
            Object object3 = ((CategoryTextLinkDetails)object2).getCategoryText();
            boolean bl2 = TextUtils.isEmpty((CharSequence)object3);
            if (!bl2) {
                n7 = 0;
                textView.setVisibility(0);
                object = ((CategoryTextLinkDetails)((ArrayList)object).get(n3)).getCategoryText();
                textView.setText((CharSequence)object);
                object = ((CategoryTextLinkDetails)object2).getPage();
                boolean bl3 = TextUtils.isEmpty((CharSequence)object);
                if (!bl3 && !(bl3 = TextUtils.isEmpty((CharSequence)(object = ((CategoryTextLinkDetails)object2).getUrlLink())))) {
                    String string2 = ((CategoryTextLinkDetails)object2).getPage();
                    String string3 = ((CategoryTextLinkDetails)object2).getUrlLink();
                    int n8 = ((CategoryTextLinkDetails)object2).getComponentPosition();
                    String string4 = ((CategoryTextLinkDetails)object2).getQuery();
                    int n10 = ((CategoryTextLinkDetails)object2).getBannerPosition();
                    String string5 = this.b;
                    String string6 = this.a;
                    String string7 = "";
                    object3 = object;
                    object = new hp1_2(string2, string3, n8, string4, string6, n10, string7, string5);
                    textView.setTag(object);
                    textView.setOnClickListener((View.OnClickListener)this);
                } else {
                    bl3 = false;
                    object = null;
                    textView.setOnClickListener(null);
                }
            } else {
                textView.setVisibility(n7);
            }
        } else {
            textView.setVisibility(n7);
        }
    }
}

