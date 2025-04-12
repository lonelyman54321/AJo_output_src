/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.ondemand.customercare.viewmodel;

import com.ril.ajio.ondemand.customercare.viewmodel.CCViewModel;
import com.ril.ajio.ondemand.customercare.viewmodel.CCViewModel$createComplaintTicketNew$1$2;
import com.ril.ajio.ondemand.customercare.viewmodel.CCViewModel$createComplaintTicketNew$1$3;
import com.ril.ajio.services.data.CustomerCare.CCComplaintAttachInfoNew;
import com.ril.ajio.services.data.CustomerCare.ImageData;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.b;

final class CCViewModel$createComplaintTicketNew$1
extends qg3_2
implements Function2 {
    final /* synthetic */ CCComplaintAttachInfoNew $attachInfo;
    int label;
    final /* synthetic */ CCViewModel this$0;

    public CCViewModel$createComplaintTicketNew$1(CCComplaintAttachInfoNew cCComplaintAttachInfoNew, CCViewModel cCViewModel, f80_0 f80_02) {
        this.$attachInfo = cCComplaintAttachInfoNew;
        this.this$0 = cCViewModel;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        CCComplaintAttachInfoNew cCComplaintAttachInfoNew = this.$attachInfo;
        CCViewModel cCViewModel = this.this$0;
        object = new CCViewModel$createComplaintTicketNew$1(cCComplaintAttachInfoNew, cCViewModel, f80_02);
        return object;
    }

    public final Object invoke(i90_0 object, f80_0 object2) {
        object = (CCViewModel$createComplaintTicketNew$1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((CCViewModel$createComplaintTicketNew$1)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        int n3;
        int n4;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        int n7;
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n8 = this.label;
        int n10 = 1;
        if (n8 != 0) {
            if (n8 == n10) {
                vl2_2.b(object);
                return Unit.a;
            }
            object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw object;
        }
        vl2_2.b(object);
        object = new ArrayList();
        Object object6 = this.$attachInfo.getImageData();
        if (object6 != null) {
            object6 = object6.iterator();
            while ((n7 = object6.hasNext()) != 0) {
                object4 = object5 = (Object)object6.next();
                object4 = (ImageData)object5;
                if ((object5 = ((ImageData)object4).getImageDetails()) == null || (n7 = object5.length()) == 0 || (object5 = ((ImageData)object4).getContentType()) == null || (n7 = object5.length()) == 0) continue;
                object3 = ((ImageData)object4).getContentType();
                object2 = ((ImageData)object4).getImageDetails();
                int n14 = 25;
                n4 = 0;
                n3 = 0;
                object5 = ImageData.copy$default((ImageData)object4, null, (String)object3, (String)object2, null, null, n14, null);
                ((ArrayList)object).add(object5);
            }
        }
        object4 = this.$attachInfo;
        object6 = ((CCComplaintAttachInfoNew)object4).getComments();
        n7 = 0;
        object5 = null;
        object3 = object6 != null && (n4 = b.k((CharSequence)object6) ^ n10) != 0 ? object6 : null;
        n8 = object.isEmpty() ^ n10;
        object2 = n8 != 0 ? object : null;
        n3 = 1;
        n4 = 0;
        object = CCComplaintAttachInfoNew.copy$default((CCComplaintAttachInfoNew)object4, null, (String)object3, object2, n3, null);
        object = CCViewModel.access$getCcApiRepo$p(this.this$0).createComplaintTicketMultiFiles((CCComplaintAttachInfoNew)object);
        object4 = this.this$0;
        object6 = new CCViewModel$createComplaintTicketNew$1$2((CCViewModel)object4, null);
        object5 = new at0_1((es0_2)object, (gx0_2)object6);
        object6 = this.this$0;
        object = new CCViewModel$createComplaintTicketNew$1$3((CCViewModel)object6);
        this.label = n10;
        object = ((at0_1)object5).collect((fs0_2)object, this);
        if (object != j90_02) return Unit.a;
        return j90_02;
    }
}

