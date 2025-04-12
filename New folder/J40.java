/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.SpannableString
 *  android.text.TextUtils
 *  android.text.style.BackgroundColorSpan
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 */
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.remoteconfig.R$id;
import com.ril.ajio.remoteconfig.devsettings.Data;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

public final class J40
extends RecyclerView$B
implements View.OnClickListener {
    public final View a;
    public final sk1_0 b;
    public final String c;
    public final TextView d;
    public final TextView e;
    public Data f;

    public J40(View view, sk1_0 sk1_02, String string2) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(sk1_02, "itemClickListener");
        Intrinsics.checkNotNullParameter(string2, "searchText");
        super(view);
        this.a = view;
        this.b = sk1_02;
        this.c = string2;
        int n3 = R$id.key;
        sk1_02 = view.findViewById(n3);
        string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(sk1_02, string2);
        sk1_02 = (TextView)sk1_02;
        this.d = sk1_02;
        n3 = R$id.value;
        view = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, string2);
        view = (TextView)view;
        this.e = view;
    }

    public static CharSequence w(String object, String object2) {
        boolean bl2;
        boolean bl3 = TextUtils.isEmpty((CharSequence)object2);
        if (bl3) {
            return object;
        }
        SpannableString spannableString = new SpannableString((CharSequence)object);
        object2 = ((String)object2).toLowerCase();
        String string2 = "toLowerCase(...)";
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = Pattern.compile((String)object2);
        object = ((String)object).toLowerCase();
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = ((Pattern)object2).matcher((CharSequence)object);
        while (bl2 = ((Matcher)object).find()) {
            object2 = new BackgroundColorSpan(0x440000FF);
            int n3 = ((Matcher)object).start();
            int n4 = ((Matcher)object).end();
            int n7 = 33;
            spannableString.setSpan(object2, n3, n4, n7);
        }
        return spannableString;
    }

    public final void onClick(View object) {
        object = this.f;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dataS");
            object = null;
        }
        int n3 = this.getAdapterPosition();
        this.b.Y((Data)object, n3);
    }
}

