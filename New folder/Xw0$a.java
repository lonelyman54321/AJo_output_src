/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.kmm.shared.model.BaseResponse;
import com.ril.ajio.kmm.shared.model.ResponseStatusType;
import java.io.PrintStream;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.a;

public final class Xw0$a
extends a
implements c90_0 {
    public final /* synthetic */ xw0_2 a;

    public Xw0$a(xw0_2 xw0_22) {
        C90$a c90$a = C90$a.a;
        this.a = xw0_22;
        super(c90$a);
    }

    public final void handleException(CoroutineContext object, Throwable throwable) {
        object = System.out;
        ((PrintStream)object).println((Object)"kmm exception");
        ((PrintStream)object).println(throwable);
        object = this.a.a;
        ResponseStatusType responseStatusType = ResponseStatusType.API_EXCEPTION;
        BaseResponse baseResponse = new BaseResponse(responseStatusType, null, null, throwable, null, null, 48, null);
        object.getClass();
        ((kb3_2)object).k(null, baseResponse);
    }
}

