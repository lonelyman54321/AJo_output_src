/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.ril.ajio.ondemand.customercare.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$layout;
import com.ril.ajio.ondemand.customercare.view.viewholder.CCAttachmentHistoryViewHolder;
import com.ril.ajio.ondemand.customercare.view.viewholder.CCAttachmentListener;
import com.ril.ajio.ondemand.customercare.view.viewholder.CCAttachmentMultiFilesViewHolder;
import com.ril.ajio.ondemand.customercare.view.viewholder.CCAttachmentViewHolderRefresh;
import com.ril.ajio.ondemand.customercare.view.viewholder.CCCartViewHolderRefresh;
import com.ril.ajio.ondemand.customercare.view.viewholder.CCComplaintDetailViewHolderRefresh;
import com.ril.ajio.ondemand.customercare.view.viewholder.CCComplaintItemViewHolderRefresh;
import com.ril.ajio.ondemand.customercare.view.viewholder.CCComplaintViewHolderRefresh;
import com.ril.ajio.ondemand.customercare.view.viewholder.CCContactUsViewHolder;
import com.ril.ajio.ondemand.customercare.view.viewholder.CCFaqAnswerViewHolder;
import com.ril.ajio.ondemand.customercare.view.viewholder.CCFaqSearchViewHolderRefresh;
import com.ril.ajio.ondemand.customercare.view.viewholder.CCFaqViewHolderRefresh;
import com.ril.ajio.ondemand.customercare.view.viewholder.CCHeaderViewHolderRefresh;
import com.ril.ajio.ondemand.customercare.view.viewholder.CCItemDetailTitleViewHolderRefresh;
import com.ril.ajio.ondemand.customercare.view.viewholder.CCItemHelpAlertViewHolderRefresh;
import com.ril.ajio.ondemand.customercare.view.viewholder.CCItemHelpButtonHolderRefresh;
import com.ril.ajio.ondemand.customercare.view.viewholder.CCItemHelpContactUsViewHolderRefresh;
import com.ril.ajio.ondemand.customercare.view.viewholder.CCItemHelpHeaderViewHolderRefresh;
import com.ril.ajio.ondemand.customercare.view.viewholder.CCLoginViewHolderRefresh;
import com.ril.ajio.ondemand.customercare.view.viewholder.CCRatingViewHolderRefresh;
import com.ril.ajio.ondemand.customercare.view.viewholder.CCSelectOrderViewHolderRefresh;
import com.ril.ajio.ondemand.customercare.view.viewholder.CCSelectTextViewHolderRefresh;
import com.ril.ajio.ondemand.customercare.view.viewholder.CCTitleViewHolderRefresh;
import com.ril.ajio.ondemand.customercare.view.viewholder.DividerViewHolder;
import com.ril.ajio.ondemand.customercare.view.viewholder.DividerViewHolderRefresh;
import com.ril.ajio.ondemand.customercare.view.viewholder.SearchFaqResultViewHolder;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public class CCBaseAdapter
extends RecyclerView$f {
    private CCAttachmentListener mCCAttachmentListener;
    public List mItemList;
    private i82_0 mOnCCClickListener;

    public CCBaseAdapter(List list, i82_0 i82_02) {
        this.mOnCCClickListener = i82_02;
        this.mItemList = list;
    }

    public CCBaseAdapter(List list, i82_0 i82_02, CCAttachmentListener cCAttachmentListener) {
        this.mOnCCClickListener = i82_02;
        this.mItemList = list;
        this.mCCAttachmentListener = cCAttachmentListener;
    }

    public int getItemCount() {
        int n3;
        List list = this.mItemList;
        if (list != null) {
            n3 = list.size();
        } else {
            n3 = 0;
            list = null;
        }
        return n3;
    }

    public final i82_0 getMOnCCClickListener() {
        return this.mOnCCClickListener;
    }

    public void onBindViewHolder(uv_2 uv_22, int n3) {
        Intrinsics.checkNotNullParameter(uv_22, "holder");
        List list = this.mItemList;
        Intrinsics.checkNotNull(list);
        list = list.get(n3);
        uv_22.setData(list, n3);
    }

    public uv_2 onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Object object;
        Object object2 = "parent";
        Intrinsics.checkNotNullParameter(viewGroup, (String)object2);
        int n4 = 105;
        CCAttachmentListener cCAttachmentListener = null;
        if (n3 != n4) {
            n4 = 106;
            if (n3 != n4) {
                block0 : switch (n3) {
                    default: {
                        switch (n3) {
                            default: {
                                object = LayoutInflater.from((Context)viewGroup.getContext());
                                n4 = R$layout.row_cc_divider;
                                viewGroup = object.inflate(n4, viewGroup, false);
                                object2 = this.mOnCCClickListener;
                                object = new DividerViewHolder((View)viewGroup, (i82_0)object2);
                                break block0;
                            }
                            case 24: {
                                object = LayoutInflater.from((Context)viewGroup.getContext());
                                n4 = R$layout.search_faq_result_row;
                                viewGroup = object.inflate(n4, viewGroup, false);
                                object2 = this.mOnCCClickListener;
                                object = new SearchFaqResultViewHolder((View)viewGroup, (i82_0)object2);
                                break block0;
                            }
                            case 23: {
                                object = LayoutInflater.from((Context)viewGroup.getContext());
                                n4 = R$layout.row_cc_faq_search_layout_refresh;
                                viewGroup = object.inflate(n4, viewGroup, false);
                                object2 = this.mOnCCClickListener;
                                object = new CCFaqSearchViewHolderRefresh((View)viewGroup, (i82_0)object2);
                                break block0;
                            }
                            case 22: {
                                object = LayoutInflater.from((Context)viewGroup.getContext());
                                n4 = R$layout.row_cc_complaint_detail_refresh;
                                viewGroup = object.inflate(n4, viewGroup, false);
                                object2 = this.mOnCCClickListener;
                                object = new CCComplaintDetailViewHolderRefresh((View)viewGroup, (i82_0)object2);
                                break block0;
                            }
                            case 21: {
                                object = LayoutInflater.from((Context)viewGroup.getContext());
                                n4 = R$layout.row_cc_attachment_refresh;
                                viewGroup = object.inflate(n4, viewGroup, false);
                                object2 = this.mOnCCClickListener;
                                cCAttachmentListener = this.mCCAttachmentListener;
                                object = new CCAttachmentViewHolderRefresh((View)viewGroup, (i82_0)object2, cCAttachmentListener);
                                break block0;
                            }
                            case 20: {
                                object = LayoutInflater.from((Context)viewGroup.getContext());
                                n4 = R$layout.cc_complaint_card_refresh;
                                viewGroup = object.inflate(n4, viewGroup, false);
                                object2 = this.mOnCCClickListener;
                                object = new CCComplaintItemViewHolderRefresh((View)viewGroup, (i82_0)object2);
                                break block0;
                            }
                            case 19: {
                                object = LayoutInflater.from((Context)viewGroup.getContext());
                                n4 = R$layout.row_cc_complaint_refresh;
                                viewGroup = object.inflate(n4, viewGroup, false);
                                object2 = this.mOnCCClickListener;
                                object = new CCComplaintViewHolderRefresh((View)viewGroup, (i82_0)object2);
                                break block0;
                            }
                            case 18: {
                                object = LayoutInflater.from((Context)viewGroup.getContext());
                                n4 = R$layout.row_cc_faq_answer_refresh;
                                viewGroup = object.inflate(n4, viewGroup, false);
                                object2 = this.mOnCCClickListener;
                                object = new CCFaqAnswerViewHolder((View)viewGroup, (i82_0)object2);
                                break block0;
                            }
                            case 17: {
                                object = LayoutInflater.from((Context)viewGroup.getContext());
                                n4 = R$layout.row_cc_select_order_refresh;
                                viewGroup = object.inflate(n4, viewGroup, false);
                                object2 = this.mOnCCClickListener;
                                object = new CCSelectTextViewHolderRefresh((View)viewGroup, (i82_0)object2);
                                break block0;
                            }
                            case 16: {
                                object = LayoutInflater.from((Context)viewGroup.getContext());
                                n4 = R$layout.row_cc_product_refresh;
                                viewGroup = object.inflate(n4, viewGroup, false);
                                object2 = this.mOnCCClickListener;
                                object = new CCCartViewHolderRefresh((View)viewGroup, (i82_0)object2);
                                break block0;
                            }
                            case 15: {
                                object = LayoutInflater.from((Context)viewGroup.getContext());
                                n4 = R$layout.row_cc_itemhelp_contactus_refresh;
                                viewGroup = object.inflate(n4, viewGroup, false);
                                object2 = this.mOnCCClickListener;
                                object = new CCItemHelpContactUsViewHolderRefresh((View)viewGroup, (i82_0)object2);
                                break block0;
                            }
                            case 14: 
                        }
                        object = LayoutInflater.from((Context)viewGroup.getContext());
                        n4 = R$layout.row_cc_selectorder_refresh;
                        viewGroup = object.inflate(n4, viewGroup, false);
                        object2 = this.mOnCCClickListener;
                        object = new CCSelectOrderViewHolderRefresh((View)viewGroup, (i82_0)object2);
                        break;
                    }
                    case 12: {
                        object = LayoutInflater.from((Context)viewGroup.getContext());
                        n4 = R$layout.row_cc_itemhelp_header_refresh;
                        viewGroup = object.inflate(n4, viewGroup, false);
                        object2 = this.mOnCCClickListener;
                        object = new CCItemHelpHeaderViewHolderRefresh((View)viewGroup, (i82_0)object2);
                        break;
                    }
                    case 11: {
                        object = LayoutInflater.from((Context)viewGroup.getContext());
                        n4 = R$layout.row_cc_itemhelp_alert_refresh;
                        viewGroup = object.inflate(n4, viewGroup, false);
                        object2 = this.mOnCCClickListener;
                        object = new CCItemHelpAlertViewHolderRefresh((View)viewGroup, (i82_0)object2);
                        break;
                    }
                    case 10: {
                        object = LayoutInflater.from((Context)viewGroup.getContext());
                        n4 = R$layout.row_cc_rating_refresh;
                        viewGroup = object.inflate(n4, viewGroup, false);
                        object2 = this.mOnCCClickListener;
                        object = new CCRatingViewHolderRefresh((View)viewGroup, (i82_0)object2);
                        break;
                    }
                    case 9: {
                        object = LayoutInflater.from((Context)viewGroup.getContext());
                        n4 = R$layout.row_cc_itemlist_refresh;
                        viewGroup = object.inflate(n4, viewGroup, false);
                        object2 = this.mOnCCClickListener;
                        object = new dg_1((View)viewGroup, (i82_0)object2);
                        break;
                    }
                    case 8: {
                        object = LayoutInflater.from((Context)viewGroup.getContext());
                        n4 = R$layout.row_cc_contactus;
                        viewGroup = object.inflate(n4, viewGroup, false);
                        object2 = this.mOnCCClickListener;
                        object = new CCContactUsViewHolder((View)viewGroup, (i82_0)object2);
                        break;
                    }
                    case 7: {
                        object = LayoutInflater.from((Context)viewGroup.getContext());
                        n4 = R$layout.row_cc_itemdetail_title_refresh;
                        viewGroup = object.inflate(n4, viewGroup, false);
                        object2 = this.mOnCCClickListener;
                        object = new CCItemDetailTitleViewHolderRefresh((View)viewGroup, (i82_0)object2);
                        break;
                    }
                    case 6: {
                        object = LayoutInflater.from((Context)viewGroup.getContext());
                        n4 = R$layout.row_cc_itemhelp_button_text_refresh;
                        viewGroup = object.inflate(n4, viewGroup, false);
                        object2 = this.mOnCCClickListener;
                        object = new CCItemHelpButtonHolderRefresh((View)viewGroup, (i82_0)object2);
                        break;
                    }
                    case 5: {
                        object = LayoutInflater.from((Context)viewGroup.getContext());
                        n4 = R$layout.row_cc_login_header_refresh;
                        viewGroup = object.inflate(n4, viewGroup, false);
                        object2 = this.mOnCCClickListener;
                        object = new CCLoginViewHolderRefresh((View)viewGroup, (i82_0)object2);
                        break;
                    }
                    case 4: {
                        object = LayoutInflater.from((Context)viewGroup.getContext());
                        n4 = R$layout.row_cc_title_refresh;
                        viewGroup = object.inflate(n4, viewGroup, false);
                        object2 = this.mOnCCClickListener;
                        object = new CCTitleViewHolderRefresh((View)viewGroup, (i82_0)object2);
                        break;
                    }
                    case 3: {
                        object = LayoutInflater.from((Context)viewGroup.getContext());
                        n4 = R$layout.row_cc_header_refresh;
                        viewGroup = object.inflate(n4, viewGroup, false);
                        object2 = this.mOnCCClickListener;
                        object = new CCHeaderViewHolderRefresh((View)viewGroup, (i82_0)object2);
                        break;
                    }
                    case 2: {
                        object = LayoutInflater.from((Context)viewGroup.getContext());
                        n4 = R$layout.row_cc_faq_refresh;
                        viewGroup = object.inflate(n4, viewGroup, false);
                        object2 = this.mOnCCClickListener;
                        object = new CCFaqViewHolderRefresh((View)viewGroup, (i82_0)object2);
                        break;
                    }
                    case 1: {
                        object = LayoutInflater.from((Context)viewGroup.getContext());
                        n4 = R$layout.row_cc_divider_refresh;
                        viewGroup = object.inflate(n4, viewGroup, false);
                        object2 = this.mOnCCClickListener;
                        object = new DividerViewHolderRefresh((View)viewGroup, (i82_0)object2);
                        break;
                    }
                }
            } else {
                object = LayoutInflater.from((Context)viewGroup.getContext());
                n4 = R$layout.row_cc_attachment_history;
                viewGroup = object.inflate(n4, viewGroup, false);
                object2 = this.mOnCCClickListener;
                object = new CCAttachmentHistoryViewHolder((View)viewGroup, (i82_0)object2);
            }
        } else {
            object = LayoutInflater.from((Context)viewGroup.getContext());
            n4 = R$layout.row_cc_attachment_return_flow_optimization;
            viewGroup = object.inflate(n4, viewGroup, false);
            object2 = this.mOnCCClickListener;
            cCAttachmentListener = this.mCCAttachmentListener;
            object = new CCAttachmentMultiFilesViewHolder((View)viewGroup, (i82_0)object2, cCAttachmentListener);
        }
        return object;
    }

    public final void setMOnCCClickListener(i82_0 i82_02) {
        this.mOnCCClickListener = i82_02;
    }
}

