/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.ratings.Question;
import com.ril.ajio.services.data.ratings.RatingsQuestionsResponseModel;

public final class iE2
implements kl2_0 {
    public final /* synthetic */ Question a;
    public final /* synthetic */ jE2 b;

    public iE2(Question question, jE2 jE22) {
        this.a = question;
        this.b = jE22;
    }

    public final void a(Integer object, String string2) {
        Object object2 = this.a;
        Integer n3 = ((Question)object2).getQuestionId();
        object2 = ((Question)object2).getTitle();
        RatingsQuestionsResponseModel ratingsQuestionsResponseModel = new RatingsQuestionsResponseModel(n3, (Integer)object, string2, (String)object2);
        object = this.b.c;
        if (object != null) {
            object.a(ratingsQuestionsResponseModel);
        }
    }
}

