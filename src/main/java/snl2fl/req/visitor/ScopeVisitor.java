package snl2fl.req.visitor;

import snl2fl.req.requirements.Scope;

/**
 * The Interface ScopeVisitor.
 *
 * @author Simone Vuotto
 * creation date 02/09/15.
 */
public interface ScopeVisitor {

    /**
     * Visit globally scope.
     *
     * @param scope the scope
     */
    void visitGloballyScope(Scope scope);

    /**
     * Visit before scope.
     *
     * @param scope the scope
     */
    void visitBeforeScope(Scope scope);

    /**
     * Visit between scope.
     *
     * @param scope the scope
     */
    void visitBetweenScope(Scope scope);

    /**
     * Visit after scope.
     *
     * @param scope the scope
     */
    void visitAfterScope(Scope scope);

    /**
     * Visit after until scope.
     *
     * @param scope the scope
     */
    void visitAfterUntilScope(Scope scope);
}
