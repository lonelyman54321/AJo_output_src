/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.ril.ajio.R$layout;
import com.ril.ajio.services.data.ratings.Question;
import com.ril.ajio.services.data.ratings.ResponseOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.Intrinsics;

public final class jE2
extends RecyclerView$f {
    public final ArrayList a;
    public final HashMap b;
    public sC2 c;

    public jE2(HashMap hashMap, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(hashMap, "selectedQuestionResponse");
        this.a = arrayList;
        this.b = hashMap;
    }

    public final int getItemCount() {
        int n3;
        ArrayList arrayList = this.a;
        if (arrayList != null) {
            n3 = arrayList.size();
        } else {
            n3 = 0;
            arrayList = null;
        }
        return n3;
    }

    public final void onBindViewHolder(RecyclerView$B object, int n3) {
        Object object2 = "viewHolder";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n4 = object instanceof jE2$a;
        if (n4 != 0) {
            Object object3;
            Question question;
            n4 = 0;
            object2 = null;
            Object object4 = this.a;
            if (object4 != null) {
                question = (Question)((ArrayList)object4).get(n3);
            } else {
                n3 = 0;
                question = null;
            }
            object = (jE2$a)object;
            object.getClass();
            if (question != null && (object4 = question.getTitle()) != null) {
                object3 = ((jE2$a)object).a;
                object3.setText((CharSequence)object4);
            }
            if (question != null && (object4 = question.getResponseOptions()) != null) {
                Object object5;
                Object object6;
                block10: {
                    boolean bl2;
                    object6 = ((RecyclerView$B)object).itemView.getContext();
                    object3 = new FlexboxLayoutManager((Context)object6);
                    ((FlexboxLayoutManager)object3).setFlexWrap(1);
                    ((FlexboxLayoutManager)object3).setFlexDirection(0);
                    int n7 = 2;
                    ((FlexboxLayoutManager)object3).setJustifyContent(n7);
                    object6 = ((jE2$a)object).b;
                    ((RecyclerView)object6).setLayoutManager((RecyclerView$o)object3);
                    object = ((jE2$a)object).c;
                    object3 = ((jE2)object).b;
                    object5 = question.getQuestionId();
                    object3 = (Integer)object3.get(object5);
                    Intrinsics.checkNotNullParameter(object4, "<this>");
                    object5 = new hx_2((ArrayList)object4);
                    Intrinsics.checkNotNullParameter(object5, "iteratorFactory");
                    object5 = (Iterator)object5.invoke();
                    kg1_2 kg1_22 = new kg1_2((Iterator)object5);
                    while (bl2 = (object5 = kg1_22.a).hasNext()) {
                        boolean bl3;
                        Object object7 = object5 = kg1_22.next();
                        object7 = (ResponseOption)((IndexedValue)object5).b;
                        if (object7 != null) {
                            object7 = ((ResponseOption)object7).getId();
                        } else {
                            bl3 = false;
                            object7 = null;
                        }
                        if (!(bl3 = Intrinsics.areEqual(object3, object7))) continue;
                        break block10;
                    }
                    bl2 = false;
                    object5 = null;
                }
                object5 = (IndexedValue)object5;
                if (object5 != null) {
                    n4 = ((IndexedValue)object5).a;
                    object2 = n4;
                }
                object5 = question.getTitle();
                object3 = new nd2_0((ArrayList)object4, (String)object5);
                if (object2 != null) {
                    ((nd2_0)object3).b = n4 = ((Integer)object2).intValue();
                    ((nd2_0)object3).d = n4;
                }
                ((nd2_0)object3).c = object2 = new iE2(question, (jE2)object);
                ((RecyclerView)object6).setAdapter((RecyclerView$f)object3);
            }
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
        int n4 = R$layout.item_rating_questions;
        viewGroup = layoutInflater.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewGroup, "inflate(...)");
        jE2$a jE2$a = new jE2$a(this, (View)viewGroup);
        return jE2$a;
    }
}

