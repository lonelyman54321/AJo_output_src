/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 */
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.search.SuggestionSearchModel;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from LV2
 */
public final class lv2_0
extends RecyclerView$f {
    public static final LV2$a Companion;
    public final MV2 a;
    public final ArrayList b;

    static {
        LV2$a lV2$a;
        Companion = lV2$a = new Object();
    }

    public lv2_0(MV2 arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "searchSuggestionListener");
        this.a = arrayList;
        this.b = arrayList = new ArrayList();
    }

    public final int getItemCount() {
        return this.b.size();
    }

    public final int getItemViewType(int n3) {
        boolean bl2;
        String string2;
        Object object = this.b.get(n3);
        Intrinsics.checkNotNull(object);
        object = (SuggestionSearchModel)object;
        boolean bl3 = false;
        String string3 = null;
        if (object != null) {
            string2 = ((SuggestionSearchModel)object).getQuery();
        } else {
            bl2 = false;
            string2 = null;
        }
        String string4 = "LUXE_SEARCH";
        int n4 = 0;
        bl2 = kotlin.text.b.i(string4, string2, false);
        if (bl2) {
            n4 = 2;
        } else {
            if (object != null) {
                string2 = ((SuggestionSearchModel)object).getQuery();
            } else {
                bl2 = false;
                string2 = null;
            }
            if (string2 == null || !(bl2 = Intrinsics.areEqual(string2 = ((SuggestionSearchModel)object).getQuery(), string4 = "SIS_SEARCH"))) {
                if (object != null) {
                    string3 = ((SuggestionSearchModel)object).getDataType();
                }
                if (string3 != null && (bl3 = kotlin.text.b.i(string3 = "STORE", string2 = ((SuggestionSearchModel)object).getDataType(), false))) {
                    n4 = 4;
                } else {
                    n4 = 1;
                    if (object != null && (n3 = (int)(((SuggestionSearchModel)object).isFromPreviousSearch() ? 1 : 0)) == n4) {
                        n4 = 5;
                    }
                }
            }
        }
        return n4;
    }

    public final void onBindViewHolder(RecyclerView$B object, int n3) {
        Intrinsics.checkNotNullParameter(object, "holder");
        Object object2 = this.b;
        Object object3 = ((ArrayList)object2).get(n3);
        Intrinsics.checkNotNull(object3);
        object3 = (SuggestionSearchModel)object3;
        int n4 = object instanceof kR2;
        Object object4 = null;
        if (n4) {
            object = (kR2)object;
            if (object3 != null) {
                object.getClass();
                object4 = ((SuggestionSearchModel)object3).getText();
            }
            ((kR2)object).b.setText((CharSequence)object4);
            object2 = object.itemView;
            object4 = new jr2_0((SuggestionSearchModel)object3, (kR2)object);
            object2.setOnClickListener((View.OnClickListener)object4);
        } else {
            n4 = object instanceof ov2_0;
            if (n4) {
                object = (ov2_0)object;
                ((ov2_0)object).a = object3;
                if (object3 != null) {
                    ((SuggestionSearchModel)object3).getText();
                }
                throw null;
            }
            n4 = object instanceof pv2_0;
            int n7 = 1;
            Object object5 = "";
            if (n4) {
                boolean bl2;
                Object object6;
                object = (pv2_0)object;
                ((pv2_0)object).c = object3;
                object2 = ((pv2_0)object).b;
                if (object3 != null) {
                    object5 = h40_0.a;
                    object5 = z40_0.Companion;
                    object5 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object5).a;
                    object6 = "is_auto_suggestion_product_count_enabled";
                    bl2 = ((ao0_0)object5).a((String)object6);
                    if (bl2) {
                        object5 = ((pv2_0)object).d;
                        if (object5 != null) {
                            object5.setVisibility(0);
                        }
                        if (object5 != null) {
                            object6 = ((SuggestionSearchModel)object3).getProductCount();
                            object5.setText((CharSequence)object6);
                        }
                    }
                    if ((object5 = ((SuggestionSearchModel)object3).getHighlightedText()) != null) {
                        object5 = ((SuggestionSearchModel)object3).getHighlightedText();
                        object2.setText((CharSequence)object5);
                    } else {
                        object5 = ((SuggestionSearchModel)object3).getText();
                        object2.setText((CharSequence)object5);
                    }
                } else {
                    object2.setText((CharSequence)object5);
                }
                if (object3 != null) {
                    object5 = ((SuggestionSearchModel)object3).getProductCount();
                } else {
                    bl2 = false;
                    object5 = null;
                }
                bl2 = TextUtils.isEmpty((CharSequence)object5);
                object6 = ((pv2_0)object).f;
                if (bl2) {
                    object5 = String.valueOf(object2.getText());
                    object6.setContentDescription((CharSequence)object5);
                } else {
                    object5 = object2.getText();
                    String string2 = object3 != null ? ((SuggestionSearchModel)object3).getProductCount() : null;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(object5);
                    stringBuilder.append(". ");
                    stringBuilder.append(string2);
                    stringBuilder.append(" Results");
                    object5 = stringBuilder.toString();
                    object6.setContentDescription((CharSequence)object5);
                }
                if (object3 != null && (object5 = ((SuggestionSearchModel)object3).getCode()) != null && !(bl2 = ((SuggestionSearchModel)object3).isFromPreviousSearch())) {
                    object2.setTypeface(null, n7);
                } else {
                    object2.setTypeface(null, 0);
                }
                object2 = z40_0.Companion;
                object2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object2).a;
                object4 = "autoSuggestionNewUIEnabled";
                n4 = (int)(((ao0_0)object2).a((String)object4) ? 1 : 0);
                object = ((pv2_0)object).e;
                if (n4 && !(n4 = (int)(og1_1.c() ? 1 : 0)) && object3 != null && (n4 = (int)(((SuggestionSearchModel)object3).isFromPreviousSearch() ? 1 : 0)) == n7) {
                    String string3;
                    object3 = od3_2.a;
                    n4 = ((String)object3).length();
                    if (!n4) {
                        object3 = od3_2.a();
                    }
                    n3 = !(n4 = (int)(s20.a ? 1 : 0)) && !(n4 = (int)(Intrinsics.areEqual(object2 = od3_2.a(), string3 = ((ld3_2)((Object)(object4 = ld3_2.STORE_AJIOGRAM))).getStoreId()) ? 1 : 0)) && (n3 = (int)(Intrinsics.areEqual(object3, object2 = ((ld3_2)((Object)object4)).getStoreId()) ? 1 : 0)) == 0 ? R$color.tint_recent_search : R$color.white;
                    n4 = R$drawable.ic_history_icon_luxe;
                    object.setImageResource(n4);
                    object2 = object.getContext();
                    n3 = t70.getColor((Context)object2, n3);
                    object.setColorFilter(n3);
                    object.setClickable(false);
                    n3 = R$string.searchHistoryIcon;
                    object3 = hv3_0.K(n3);
                    object.setContentDescription((CharSequence)object3);
                } else {
                    object2 = z40$a.a((Context)AJIOApplication$a.a()).a;
                    n4 = (int)(((ao0_0)object2).a((String)object4) ? 1 : 0);
                    if (!n4 && object3 != null && (n3 = (int)(((SuggestionSearchModel)object3).isFromPreviousSearch() ? 1 : 0)) == n7) {
                        object3 = od3_2.a;
                        n4 = ((String)object3).length();
                        if (!n4) {
                            object3 = od3_2.a();
                        }
                        n3 = !(n4 = (int)(s20.a ? 1 : 0)) && !(n4 = (int)(Intrinsics.areEqual(object2 = od3_2.a(), object5 = ((ld3_2)((Object)(object4 = ld3_2.STORE_AJIOGRAM))).getStoreId()) ? 1 : 0)) && (n3 = (int)(Intrinsics.areEqual(object3, object2 = ((ld3_2)((Object)object4)).getStoreId()) ? 1 : 0)) == 0 ? R$color.black : R$color.white;
                        n4 = R$drawable.ic_cross_button_history_search;
                        object.setImageResource(n4);
                        object2 = object.getContext();
                        n3 = t70.getColor((Context)object2, n3);
                        object.setColorFilter(n3);
                        object.setClickable(n7 != 0);
                        n3 = R$string.searchCrossIcon;
                        object3 = hv3_0.K(n3);
                        object.setContentDescription((CharSequence)object3);
                    } else {
                        String string4;
                        object3 = od3_2.a;
                        n4 = ((String)object3).length();
                        if (!n4) {
                            object3 = od3_2.a();
                        }
                        n3 = !(n4 = (int)(s20.a ? 1 : 0)) && !(n4 = (int)(Intrinsics.areEqual(object2 = od3_2.a(), string4 = ((ld3_2)((Object)(object4 = ld3_2.STORE_AJIOGRAM))).getStoreId()) ? 1 : 0)) && (n3 = (int)(Intrinsics.areEqual(object3, object2 = ((ld3_2)((Object)object4)).getStoreId()) ? 1 : 0)) == 0 ? R$color.color_202020 : R$color.white;
                        n4 = R$drawable.ic_search_icon_search_autosuggestion;
                        object.setImageResource(n4);
                        object2 = object.getContext();
                        n3 = t70.getColor((Context)object2, n3);
                        object.setColorFilter(n3);
                        object.setClickable(false);
                        n3 = R$string.searchItemIcon;
                        object3 = hv3_0.K(n3);
                        object.setContentDescription((CharSequence)object3);
                    }
                }
            } else {
                n4 = object instanceof RV2;
                if (n4) {
                    object = (RV2)object;
                    if (object3 != null) {
                        object.getClass();
                        object5 = ((SuggestionSearchModel)object3).getText();
                    }
                    ((RV2)object).b.setText((CharSequence)object5);
                    object2 = object.itemView;
                    object4 = new QV2((RV2)object, (SuggestionSearchModel)object3);
                    object2.setOnClickListener((View.OnClickListener)object4);
                } else {
                    n4 = object instanceof nv2_0;
                    if (n4) {
                        object = (nv2_0)object;
                        ((nv2_0)object).d = object3;
                        object2 = ((nv2_0)object).b;
                        if (object3 != null) {
                            object4 = ((SuggestionSearchModel)object3).getText();
                            object2.setText((CharSequence)object4);
                            object2 = ((SuggestionSearchModel)object3).getImageUrl();
                            object = ((nv2_0)object).c;
                            if (object2 != null && (n4 = ((String)object2).length())) {
                                object2 = new da$a();
                                ((da$a)object2).k = n7;
                                ((da$a)object2).g = n7;
                                ((da$a)object2).n = object3 = ((SuggestionSearchModel)object3).getImageUrl();
                                ((da$a)object2).u = object;
                                ((da$a)object2).a();
                                ai0_2.B((View)object);
                            } else {
                                ai0_2.i((View)object);
                            }
                        } else {
                            object2.setText((CharSequence)object5);
                        }
                    }
                }
            }
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Object object;
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        MV2 mV2 = this.a;
        if (n3 != 0) {
            int n4 = 2;
            if (n3 != n4) {
                n4 = 4;
                if (n3 != n4) {
                    n4 = (int)(og1_1.c() ? 1 : 0);
                    int n7 = 5;
                    if (n4 != 0) {
                        if (n3 == n7) {
                            object = LayoutInflater.from((Context)viewGroup.getContext());
                            n4 = R$layout.layout_search_suggestion_refresh_luxe_history;
                            viewGroup = object.inflate(n4, viewGroup, false);
                        } else {
                            object = LayoutInflater.from((Context)viewGroup.getContext());
                            n4 = R$layout.layout_search_suggestion_luxe;
                            viewGroup = object.inflate(n4, viewGroup, false);
                        }
                    } else if (n3 == n7) {
                        object = LayoutInflater.from((Context)viewGroup.getContext());
                        n4 = R$layout.layout_search_suggestion_refresh_history;
                        viewGroup = object.inflate(n4, viewGroup, false);
                    } else {
                        object = LayoutInflater.from((Context)viewGroup.getContext());
                        n4 = R$layout.layout_search_suggestion_refresh;
                        viewGroup = object.inflate(n4, viewGroup, false);
                    }
                    object = new pv2_0((View)viewGroup, mV2);
                } else {
                    object = LayoutInflater.from((Context)viewGroup.getContext());
                    n4 = R$layout.layout_search_suggestion_store;
                    viewGroup = object.inflate(n4, viewGroup, false);
                    object = new nv2_0((View)viewGroup, mV2);
                }
            } else {
                object = LayoutInflater.from((Context)viewGroup.getContext());
                n4 = R$layout.layout_search_suggestion_refresh_luxe;
                viewGroup = object.inflate(n4, viewGroup, false);
                object = new RV2((View)viewGroup, mV2);
            }
        } else {
            object = LayoutInflater.from((Context)viewGroup.getContext());
            int n8 = R$layout.layout_sis_search_item;
            viewGroup = object.inflate(n8, viewGroup, false);
            object = new kR2((View)viewGroup, mV2);
        }
        return object;
    }
}

