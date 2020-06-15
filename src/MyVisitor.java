import java.util.HashMap;
import java.util.Map;

public class MyVisitor extends DemoBaseVisitor<String> {

    private Map<String, Integer> variables = new HashMap< >();
    @Override
    public String visitPrintln(DemoParser.PrintlnContext ctx){
        return        "   getstatic java/lang/System/out Ljava/io/PrintStream;\n" +
                visit(ctx.argument) + "\n" +
                "   invokevirtual java/io/PrintStream/println(I)V\n" ; //getstatic holt und das System.out auf dem Stack.
    }

    @Override
    public String visitPlus(DemoParser.PlusContext ctx) {
        return visitChildren(ctx) + "\n"
                + "iadd";
    }

    @Override
    public String visitMinus(DemoParser.MinusContext ctx) {
        return visitChildren(ctx) + "\n"
                + "isub";
    }

    

    @Override
    public String visitDiv(DemoParser.DivContext ctx) {
        return visitChildren(ctx) + "\n"
                + "idiv";
    }

    @Override
    public String visitMult(DemoParser.MultContext ctx) {
        return visitChildren(ctx) + "\n"
                + "imul";
    }

    @Override
    public String visitNumber(DemoParser.NumberContext ctx) {
        return "ldc " + ctx.number.getText();
    }

    @Override
    public String visitVarDeclaration(DemoParser.VarDeclarationContext ctx) {
        variables.put(ctx.varName.getText(), variables.size());
        return "";
    }

    @Override
    public String visitAssignment(DemoParser.AssignmentContext ctx) {
        return visit(ctx.expr) + "\n" +
        "istore " + variables.get(ctx.varName.getText());
    }

    @Override
    public String visitVariable(DemoParser.VariableContext ctx) {
        return visit(ctx.expr) + "\n" +
                "iload " + variables.get(ctx.varName.getText());
    }

    @Override
    protected String aggregateResult(String aggregate, String nextResult) {
        if(aggregate == null){
            return nextResult;
        }
        if(nextResult == null){
            return aggregate;
        }
        return aggregate + "\n" + nextResult;
    }
}