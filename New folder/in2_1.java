/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.net.Uri
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.ProgressBar
 */
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$layout;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from iN2
 */
public final class in2_1
extends RecyclerView$f {
    public final jn2_1 a;
    public final ArrayList b;

    public in2_1(jn2_1 arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "listener");
        this.a = arrayList;
        this.b = arrayList = new ArrayList();
    }

    public final int getItemCount() {
        int n3;
        ArrayList arrayList = this.b;
        int n4 = arrayList.size();
        if (n4 <= (n3 = 3)) {
            n3 = arrayList.size();
        }
        return n3;
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        recyclerView$B = (ln2_2)recyclerView$B;
        Object object = "holder";
        Intrinsics.checkNotNullParameter(recyclerView$B, (String)object);
        int n4 = 3;
        if (n3 < n4) {
            Object object2;
            object = (fn2_1)this.b.get(n3);
            int n7 = ((fn2_1)object).c;
            int n8 = 8;
            boolean bl2 = false;
            ImageView imageView = null;
            if (n7 != 0) {
                ((ln2_2)recyclerView$B).c.setVisibility(n8);
                ((ln2_2)recyclerView$B).d.setVisibility(n8);
                ((ln2_2)recyclerView$B).e.setVisibility(n8);
                ((ln2_2)recyclerView$B).f.setVisibility(n8);
                object = ((ln2_2)recyclerView$B).a;
                object.setVisibility(0);
            } else {
                ((ln2_2)recyclerView$B).c.setVisibility(0);
                ((ln2_2)recyclerView$B).d.setVisibility(0);
                ((ln2_2)recyclerView$B).a.setVisibility(n8);
                object2 = ((ln2_2)recyclerView$B).e;
                object2.setVisibility(n8);
                ProgressBar progressBar = ((ln2_2)recyclerView$B).f;
                progressBar.setVisibility(n8);
                boolean bl3 = ((fn2_1)object).f;
                if (!bl3) {
                    object2 = this.a;
                    object2.o8(n3);
                    n7 = ((fn2_1)object).h;
                    progressBar.setVisibility(0);
                    progressBar.setProgress(n7);
                } else {
                    bl3 = ((fn2_1)object).g;
                    if (bl3) {
                        n7 = ((fn2_1)object).h;
                        progressBar.setVisibility(0);
                        progressBar.setProgress(n7);
                    } else {
                        bl3 = ((fn2_1)object).d;
                        if (bl3) {
                            object2.setVisibility(0);
                            progressBar.setVisibility(n8);
                        } else {
                            bl2 = ((fn2_1)object).e;
                            if (bl2) {
                                object2.setVisibility(n8);
                                progressBar.setVisibility(n8);
                            }
                        }
                    }
                }
                object2 = ((fn2_1)object).b;
                n8 = (int)(TextUtils.isEmpty((CharSequence)object2) ? 1 : 0);
                imageView = ((ln2_2)recyclerView$B).b;
                if (n8 == 0) {
                    n4 = 1;
                    object = ty2_2.d(n4, (String)object2);
                    imageView.setImageBitmap((Bitmap)object);
                } else {
                    object = ((fn2_1)object).a;
                    imageView.setImageURI((Uri)object);
                }
            }
            object = ((ln2_2)recyclerView$B).d;
            object2 = new gn2_0(this, n3);
            object.setOnClickListener((View.OnClickListener)object2);
            object = new hn2_1(this, n3);
            recyclerView$B = ((ln2_2)recyclerView$B).e;
            recyclerView$B.setOnClickListener((View.OnClickListener)object);
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        Object object = LayoutInflater.from((Context)viewGroup.getContext());
        int n4 = R$layout.layout_return_image;
        viewGroup = object.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewGroup, "inflate(...)");
        object = this.a;
        ln2_2 ln2_22 = new ln2_2((View)viewGroup, (jn2_1)object);
        return ln2_22;
    }
}

