package kr.co.lotteon.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QProduct is a Querydsl query type for Product
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QProduct extends EntityPathBase<Product> {

    private static final long serialVersionUID = 425002604L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QProduct product = new QProduct("product");

    public final NumberPath<Integer> cate = createNumber("cate", Integer.class);

    public final StringPath company = createString("company");

    public final DateTimePath<java.time.LocalDateTime> deldate = createDateTime("deldate", java.time.LocalDateTime.class);

    public final NumberPath<Integer> deliprice = createNumber("deliprice", Integer.class);

    public final NumberPath<Integer> discount = createNumber("discount", Integer.class);

    public final NumberPath<Integer> hit = createNumber("hit", Integer.class);

    public final StringPath info = createString("info");

    public final StringPath opname = createString("opname");

    public final StringPath opvalue = createString("opvalue");

    public final StringPath pname = createString("pname");

    public final NumberPath<Integer> pno = createNumber("pno", Integer.class);

    public final NumberPath<Integer> point = createNumber("point", Integer.class);

    public final NumberPath<Integer> price = createNumber("price", Integer.class);

    public final QProductimg productimg;

    public final DateTimePath<java.time.LocalDateTime> rdate = createDateTime("rdate", java.time.LocalDateTime.class);

    public final ListPath<Review, QReview> reviews = this.<Review, QReview>createList("reviews", Review.class, QReview.class, PathInits.DIRECT2);

    public final StringPath sid = createString("sid");

    public final NumberPath<Integer> stock = createNumber("stock", Integer.class);

    public QProduct(String variable) {
        this(Product.class, forVariable(variable), INITS);
    }

    public QProduct(Path<? extends Product> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QProduct(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QProduct(PathMetadata metadata, PathInits inits) {
        this(Product.class, metadata, inits);
    }

    public QProduct(Class<? extends Product> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.productimg = inits.isInitialized("productimg") ? new QProductimg(forProperty("productimg"), inits.get("productimg")) : null;
    }

}

