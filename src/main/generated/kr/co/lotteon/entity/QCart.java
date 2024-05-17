package kr.co.lotteon.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QCart is a Querydsl query type for Cart
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCart extends EntityPathBase<Cart> {

    private static final long serialVersionUID = 900528835L;

    public static final QCart cart = new QCart("cart");

    public final NumberPath<Integer> cno = createNumber("cno", Integer.class);

    public final StringPath options = createString("options");

    public final NumberPath<Integer> pcount = createNumber("pcount", Integer.class);

    public final NumberPath<Integer> pno = createNumber("pno", Integer.class);

    public final StringPath uid = createString("uid");

    public QCart(String variable) {
        super(Cart.class, forVariable(variable));
    }

    public QCart(Path<? extends Cart> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCart(PathMetadata metadata) {
        super(Cart.class, metadata);
    }

}

