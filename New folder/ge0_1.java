/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ril.ajio.kmm.shared.model.BaseResponse;
import com.ril.ajio.kmm.shared.model.ResponseStatusType;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.a;

/*
 * Renamed from GE0
 */
public final class ge0_1
extends a
implements c90_0 {
    public final /* synthetic */ ie0_1 a;

    public ge0_1(ie0_1 ie0_12) {
        C90$a c90$a = C90$a.a;
        this.a = ie0_12;
        super(c90$a);
    }

    public final void handleException(CoroutineContext object, Throwable throwable) {
        System.out.println(throwable);
        object = this.a.c;
        ResponseStatusType responseStatusType = ResponseStatusType.API_EXCEPTION;
        BaseResponse baseResponse = new BaseResponse(responseStatusType, null, null, throwable, null, null, 48, null);
        ((LiveData)object).k(baseResponse);
    }
}

