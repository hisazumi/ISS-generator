/*
* generated by Xtext
*/
grammar InternalMcore;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package nel.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package nel.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import nel.services.McoreGrammarAccess;

}

@parser::members {
 
 	private McoreGrammarAccess grammarAccess;
 	
    public InternalMcoreParser(TokenStream input, IAstFactory factory, McoreGrammarAccess grammarAccess) {
        this(input);
        this.factory = factory;
        registerRules(grammarAccess.getGrammar());
        this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected InputStream getTokenFile() {
    	ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("nel/parser/antlr/internal/InternalMcore.tokens");
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Model";	
   	} 
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null] :
	{ currentNode = createCompositeNode(grammarAccess.getModelRule(), currentNode); }
	 iv_ruleModel=ruleModel 
	 { $current=$iv_ruleModel.current; } 
	 EOF 
;

// Rule Model
ruleModel returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(	
	
	    
	    { 
	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getInstructionsInstructionParserRuleCall_0(), currentNode); 
	    }
	    lv_instructions_0=ruleInstruction 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        
	        try {
	       		add($current, "instructions", lv_instructions_0, "Instruction", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }
	
)*;





// Entry rule entryRuleInstruction
entryRuleInstruction returns [EObject current=null] :
	{ currentNode = createCompositeNode(grammarAccess.getInstructionRule(), currentNode); }
	 iv_ruleInstruction=ruleInstruction 
	 { $current=$iv_ruleInstruction.current; } 
	 EOF 
;

// Rule Instruction
ruleInstruction returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
('instruction' 
    {
        createLeafNode(grammarAccess.getInstructionAccess().getInstructionKeyword_0(), null); 
    }
(	
	
	    lv_name_1=	RULE_ID
	{
		createLeafNode(grammarAccess.getInstructionAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
	}
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getInstructionRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "name", lv_name_1, "ID", lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }
	
)'{' 
    {
        createLeafNode(grammarAccess.getInstructionAccess().getLeftCurlyBracketKeyword_2(), null); 
    }
(	
	
	    
	    { 
	        currentNode=createCompositeNode(grammarAccess.getInstructionAccess().getTypeInstTypeParserRuleCall_3_0(), currentNode); 
	    }
	    lv_type_3=ruleInstType 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getInstructionRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        
	        try {
	       		set($current, "type", lv_type_3, "InstType", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }
	
)(	
	
	    
	    { 
	        currentNode=createCompositeNode(grammarAccess.getInstructionAccess().getCodingCodingParserRuleCall_4_0(), currentNode); 
	    }
	    lv_coding_4=ruleCoding 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getInstructionRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        
	        try {
	       		set($current, "coding", lv_coding_4, "Coding", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }
	
)(	
	
	    
	    { 
	        currentNode=createCompositeNode(grammarAccess.getInstructionAccess().getBehaviorBehaviorParserRuleCall_5_0(), currentNode); 
	    }
	    lv_behavior_5=ruleBehavior 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getInstructionRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        
	        try {
	       		set($current, "behavior", lv_behavior_5, "Behavior", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }
	
)'}' 
    {
        createLeafNode(grammarAccess.getInstructionAccess().getRightCurlyBracketKeyword_6(), null); 
    }
);





// Entry rule entryRuleInstType
entryRuleInstType returns [EObject current=null] :
	{ currentNode = createCompositeNode(grammarAccess.getInstTypeRule(), currentNode); }
	 iv_ruleInstType=ruleInstType 
	 { $current=$iv_ruleInstType.current; } 
	 EOF 
;

// Rule InstType
ruleInstType returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
('type' 
    {
        createLeafNode(grammarAccess.getInstTypeAccess().getTypeKeyword_0(), null); 
    }
(	
	
	    
	    { 
	        currentNode=createCompositeNode(grammarAccess.getInstTypeAccess().getTypeInstTypeLabelParserRuleCall_1_0(), currentNode); 
	    }
	    lv_type_1=ruleInstTypeLabel 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getInstTypeRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        
	        try {
	       		set($current, "type", lv_type_1, "InstTypeLabel", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }
	
)';' 
    {
        createLeafNode(grammarAccess.getInstTypeAccess().getSemicolonKeyword_2(), null); 
    }
);





// Entry rule entryRuleCoding
entryRuleCoding returns [EObject current=null] :
	{ currentNode = createCompositeNode(grammarAccess.getCodingRule(), currentNode); }
	 iv_ruleCoding=ruleCoding 
	 { $current=$iv_ruleCoding.current; } 
	 EOF 
;

// Rule Coding
ruleCoding returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
('coding' 
    {
        createLeafNode(grammarAccess.getCodingAccess().getCodingKeyword_0(), null); 
    }
(	
	
	    lv_coding_1=	RULE_BINARY
	{
		createLeafNode(grammarAccess.getCodingAccess().getCodingBinaryTerminalRuleCall_1_0(), "coding"); 
	}
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getCodingRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "coding", lv_coding_1, "Binary", lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }
	
)';' 
    {
        createLeafNode(grammarAccess.getCodingAccess().getSemicolonKeyword_2(), null); 
    }
);





// Entry rule entryRuleBehavior
entryRuleBehavior returns [EObject current=null] :
	{ currentNode = createCompositeNode(grammarAccess.getBehaviorRule(), currentNode); }
	 iv_ruleBehavior=ruleBehavior 
	 { $current=$iv_ruleBehavior.current; } 
	 EOF 
;

// Rule Behavior
ruleBehavior returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
('behavior' 
    {
        createLeafNode(grammarAccess.getBehaviorAccess().getBehaviorKeyword_0(), null); 
    }
'{' 
    {
        createLeafNode(grammarAccess.getBehaviorAccess().getLeftCurlyBracketKeyword_1(), null); 
    }
(((	
	
	    
	    { 
	        currentNode=createCompositeNode(grammarAccess.getBehaviorAccess().getExpressionsExpressionParserRuleCall_2_0_0_0(), currentNode); 
	    }
	    lv_expressions_2=ruleExpression 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getBehaviorRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        
	        try {
	       		add($current, "expressions", lv_expressions_2, "Expression", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }
	
)
    |(	
	
	    
	    { 
	        currentNode=createCompositeNode(grammarAccess.getBehaviorAccess().getConditionsConditionParserRuleCall_2_0_1_0(), currentNode); 
	    }
	    lv_conditions_3=ruleCondition 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getBehaviorRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        
	        try {
	       		add($current, "conditions", lv_conditions_3, "Condition", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }
	
))';' 
    {
        createLeafNode(grammarAccess.getBehaviorAccess().getSemicolonKeyword_2_1(), null); 
    }
)*'}' 
    {
        createLeafNode(grammarAccess.getBehaviorAccess().getRightCurlyBracketKeyword_3(), null); 
    }
);





// Entry rule entryRuleExpression
entryRuleExpression returns [EObject current=null] :
	{ currentNode = createCompositeNode(grammarAccess.getExpressionRule(), currentNode); }
	 iv_ruleExpression=ruleExpression 
	 { $current=$iv_ruleExpression.current; } 
	 EOF 
;

// Rule Expression
ruleExpression returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((	
	
	    
	    { 
	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getLexpLExpParserRuleCall_0_0(), currentNode); 
	    }
	    lv_lexp_0=ruleLExp 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        
	        try {
	       		set($current, "lexp", lv_lexp_0, "LExp", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }
	
)'=' 
    {
        createLeafNode(grammarAccess.getExpressionAccess().getEqualsSignKeyword_1(), null); 
    }
(	
	
	    
	    { 
	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getRexpRExpParserRuleCall_2_0(), currentNode); 
	    }
	    lv_rexp_2=ruleRExp 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        
	        try {
	       		set($current, "rexp", lv_rexp_2, "RExp", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }
	
));





// Entry rule entryRuleLExp
entryRuleLExp returns [EObject current=null] :
	{ currentNode = createCompositeNode(grammarAccess.getLExpRule(), currentNode); }
	 iv_ruleLExp=ruleLExp 
	 { $current=$iv_ruleLExp.current; } 
	 EOF 
;

// Rule LExp
ruleLExp returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(	
	
	    
	    { 
	        currentNode=createCompositeNode(grammarAccess.getLExpAccess().getRegREGSParserRuleCall_0(), currentNode); 
	    }
	    lv_reg_0=ruleREGS 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getLExpRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        
	        try {
	       		set($current, "reg", lv_reg_0, "REGS", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }
	
);





// Entry rule entryRuleRExp
entryRuleRExp returns [EObject current=null] :
	{ currentNode = createCompositeNode(grammarAccess.getRExpRule(), currentNode); }
	 iv_ruleRExp=ruleRExp 
	 { $current=$iv_ruleRExp.current; } 
	 EOF 
;

// Rule RExp
ruleRExp returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((	
	
	    
	    { 
	        currentNode=createCompositeNode(grammarAccess.getRExpAccess().getArgREGSARGSParserRuleCall_0_0(), currentNode); 
	    }
	    lv_arg_0=ruleREGSARGS 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getRExpRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        
	        try {
	       		set($current, "arg", lv_arg_0, "REGSARGS", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }
	
)
    |((	
	
	    
	    { 
	        currentNode=createCompositeNode(grammarAccess.getRExpAccess().getLargREGSARGSParserRuleCall_1_0_0(), currentNode); 
	    }
	    lv_larg_1=ruleREGSARGS 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getRExpRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        
	        try {
	       		set($current, "larg", lv_larg_1, "REGSARGS", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }
	
)(	
	
	    
	    { 
	        currentNode=createCompositeNode(grammarAccess.getRExpAccess().getAopAOPsParserRuleCall_1_1_0(), currentNode); 
	    }
	    lv_aop_2=ruleAOPs 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getRExpRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        
	        try {
	       		set($current, "aop", lv_aop_2, "AOPs", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }
	
)(	
	
	    
	    { 
	        currentNode=createCompositeNode(grammarAccess.getRExpAccess().getRargREGSARGSParserRuleCall_1_2_0(), currentNode); 
	    }
	    lv_rarg_3=ruleREGSARGS 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getRExpRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        
	        try {
	       		set($current, "rarg", lv_rarg_3, "REGSARGS", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }
	
)));





// Entry rule entryRuleCondition
entryRuleCondition returns [EObject current=null] :
	{ currentNode = createCompositeNode(grammarAccess.getConditionRule(), currentNode); }
	 iv_ruleCondition=ruleCondition 
	 { $current=$iv_ruleCondition.current; } 
	 EOF 
;

// Rule Condition
ruleCondition returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
('if' 
    {
        createLeafNode(grammarAccess.getConditionAccess().getIfKeyword_0(), null); 
    }
'(' 
    {
        createLeafNode(grammarAccess.getConditionAccess().getLeftParenthesisKeyword_1(), null); 
    }
(	
	
	    
	    { 
	        currentNode=createCompositeNode(grammarAccess.getConditionAccess().getLargREGSARGSParserRuleCall_2_0(), currentNode); 
	    }
	    lv_larg_2=ruleREGSARGS 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getConditionRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        
	        try {
	       		set($current, "larg", lv_larg_2, "REGSARGS", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }
	
)(	
	
	    
	    { 
	        currentNode=createCompositeNode(grammarAccess.getConditionAccess().getCmpopCMPOPsParserRuleCall_3_0(), currentNode); 
	    }
	    lv_cmpop_3=ruleCMPOPs 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getConditionRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        
	        try {
	       		set($current, "cmpop", lv_cmpop_3, "CMPOPs", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }
	
)(	
	
	    
	    { 
	        currentNode=createCompositeNode(grammarAccess.getConditionAccess().getRargREGSARGSParserRuleCall_4_0(), currentNode); 
	    }
	    lv_rarg_4=ruleREGSARGS 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getConditionRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        
	        try {
	       		set($current, "rarg", lv_rarg_4, "REGSARGS", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }
	
)',' 
    {
        createLeafNode(grammarAccess.getConditionAccess().getCommaKeyword_5(), null); 
    }
(	
	
	    
	    { 
	        currentNode=createCompositeNode(grammarAccess.getConditionAccess().getThentargetJMPTARGETParserRuleCall_6_0(), currentNode); 
	    }
	    lv_thentarget_6=ruleJMPTARGET 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getConditionRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        
	        try {
	       		set($current, "thentarget", lv_thentarget_6, "JMPTARGET", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }
	
)',' 
    {
        createLeafNode(grammarAccess.getConditionAccess().getCommaKeyword_7(), null); 
    }
(	
	
	    
	    { 
	        currentNode=createCompositeNode(grammarAccess.getConditionAccess().getElsetargetJMPTARGETParserRuleCall_8_0(), currentNode); 
	    }
	    lv_elsetarget_8=ruleJMPTARGET 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getConditionRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        
	        try {
	       		set($current, "elsetarget", lv_elsetarget_8, "JMPTARGET", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }
	
)')' 
    {
        createLeafNode(grammarAccess.getConditionAccess().getRightParenthesisKeyword_9(), null); 
    }
);





// Entry rule entryRuleREGSARGS
entryRuleREGSARGS returns [EObject current=null] :
	{ currentNode = createCompositeNode(grammarAccess.getREGSARGSRule(), currentNode); }
	 iv_ruleREGSARGS=ruleREGSARGS 
	 { $current=$iv_ruleREGSARGS.current; } 
	 EOF 
;

// Rule REGSARGS
ruleREGSARGS returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((	
	
	    
	    { 
	        currentNode=createCompositeNode(grammarAccess.getREGSARGSAccess().getRegREGSParserRuleCall_0_0(), currentNode); 
	    }
	    lv_reg_0=ruleREGS 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getREGSARGSRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        
	        try {
	       		set($current, "reg", lv_reg_0, "REGS", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }
	
)
    |(	
	
	    
	    { 
	        currentNode=createCompositeNode(grammarAccess.getREGSARGSAccess().getArgARGSParserRuleCall_1_0(), currentNode); 
	    }
	    lv_arg_1=ruleARGS 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getREGSARGSRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        
	        try {
	       		set($current, "arg", lv_arg_1, "ARGS", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }
	
));





// Entry rule entryRuleJMPTARGET
entryRuleJMPTARGET returns [String current=null] :
	{ currentNode = createCompositeNode(grammarAccess.getJMPTARGETRule(), currentNode); } 
	 iv_ruleJMPTARGET=ruleJMPTARGET 
	 { $current=$iv_ruleJMPTARGET.current.getText(); }  
	 EOF 
;

// Rule JMPTARGET
ruleJMPTARGET returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
	    lastConsumedNode = currentNode;
	    lastConsumedDatatypeToken = $current;
    }:
(
	kw='IM' 
    {
        $current.merge(kw);
        createLeafNode(grammarAccess.getJMPTARGETAccess().getIMKeyword_0(), null); 
    }

    |
	kw='NEXT' 
    {
        $current.merge(kw);
        createLeafNode(grammarAccess.getJMPTARGETAccess().getNEXTKeyword_1(), null); 
    }
)
    ;





// Entry rule entryRuleREGS
entryRuleREGS returns [EObject current=null] :
	{ currentNode = createCompositeNode(grammarAccess.getREGSRule(), currentNode); }
	 iv_ruleREGS=ruleREGS 
	 { $current=$iv_ruleREGS.current; } 
	 EOF 
;

// Rule REGS
ruleREGS returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
('regs' 
    {
        createLeafNode(grammarAccess.getREGSAccess().getRegsKeyword_0(), null); 
    }
'[' 
    {
        createLeafNode(grammarAccess.getREGSAccess().getLeftSquareBracketKeyword_1(), null); 
    }
(	
	
	    
	    { 
	        currentNode=createCompositeNode(grammarAccess.getREGSAccess().getArgARGSParserRuleCall_2_0(), currentNode); 
	    }
	    lv_arg_2=ruleARGS 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getREGSRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        
	        try {
	       		set($current, "arg", lv_arg_2, "ARGS", currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }
	
)']' 
    {
        createLeafNode(grammarAccess.getREGSAccess().getRightSquareBracketKeyword_3(), null); 
    }
);





// Entry rule entryRuleARGS
entryRuleARGS returns [String current=null] :
	{ currentNode = createCompositeNode(grammarAccess.getARGSRule(), currentNode); } 
	 iv_ruleARGS=ruleARGS 
	 { $current=$iv_ruleARGS.current.getText(); }  
	 EOF 
;

// Rule ARGS
ruleARGS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
	    lastConsumedNode = currentNode;
	    lastConsumedDatatypeToken = $current;
    }:
(
	kw='IM' 
    {
        $current.merge(kw);
        createLeafNode(grammarAccess.getARGSAccess().getIMKeyword_0(), null); 
    }

    |
	kw='RD' 
    {
        $current.merge(kw);
        createLeafNode(grammarAccess.getARGSAccess().getRDKeyword_1(), null); 
    }

    |
	kw='RS' 
    {
        $current.merge(kw);
        createLeafNode(grammarAccess.getARGSAccess().getRSKeyword_2(), null); 
    }

    |
	kw='RT' 
    {
        $current.merge(kw);
        createLeafNode(grammarAccess.getARGSAccess().getRTKeyword_3(), null); 
    }

    |
	kw='addr' 
    {
        $current.merge(kw);
        createLeafNode(grammarAccess.getARGSAccess().getAddrKeyword_4(), null); 
    }
)
    ;





// Entry rule entryRuleAOPs
entryRuleAOPs returns [String current=null] :
	{ currentNode = createCompositeNode(grammarAccess.getAOPsRule(), currentNode); } 
	 iv_ruleAOPs=ruleAOPs 
	 { $current=$iv_ruleAOPs.current.getText(); }  
	 EOF 
;

// Rule AOPs
ruleAOPs returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
	    lastConsumedNode = currentNode;
	    lastConsumedDatatypeToken = $current;
    }:
(
	kw='+' 
    {
        $current.merge(kw);
        createLeafNode(grammarAccess.getAOPsAccess().getPlusSignKeyword_0(), null); 
    }

    |
	kw='-' 
    {
        $current.merge(kw);
        createLeafNode(grammarAccess.getAOPsAccess().getHyphenMinusKeyword_1(), null); 
    }

    |
	kw='*' 
    {
        $current.merge(kw);
        createLeafNode(grammarAccess.getAOPsAccess().getAsteriskKeyword_2(), null); 
    }

    |
	kw='/' 
    {
        $current.merge(kw);
        createLeafNode(grammarAccess.getAOPsAccess().getSolidusKeyword_3(), null); 
    }
)
    ;





// Entry rule entryRuleCMPOPs
entryRuleCMPOPs returns [String current=null] :
	{ currentNode = createCompositeNode(grammarAccess.getCMPOPsRule(), currentNode); } 
	 iv_ruleCMPOPs=ruleCMPOPs 
	 { $current=$iv_ruleCMPOPs.current.getText(); }  
	 EOF 
;

// Rule CMPOPs
ruleCMPOPs returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
	    lastConsumedNode = currentNode;
	    lastConsumedDatatypeToken = $current;
    }:
(
	kw='==' 
    {
        $current.merge(kw);
        createLeafNode(grammarAccess.getCMPOPsAccess().getEqualsSignEqualsSignKeyword_0(), null); 
    }

    |
	kw='!=' 
    {
        $current.merge(kw);
        createLeafNode(grammarAccess.getCMPOPsAccess().getExclamationMarkEqualsSignKeyword_1(), null); 
    }

    |
	kw='<' 
    {
        $current.merge(kw);
        createLeafNode(grammarAccess.getCMPOPsAccess().getLessThanSignKeyword_2(), null); 
    }

    |
	kw='>' 
    {
        $current.merge(kw);
        createLeafNode(grammarAccess.getCMPOPsAccess().getGreaterThanSignKeyword_3(), null); 
    }

    |
	kw='<=' 
    {
        $current.merge(kw);
        createLeafNode(grammarAccess.getCMPOPsAccess().getLessThanSignEqualsSignKeyword_4(), null); 
    }

    |
	kw='>=' 
    {
        $current.merge(kw);
        createLeafNode(grammarAccess.getCMPOPsAccess().getGreaterThanSignEqualsSignKeyword_5(), null); 
    }
)
    ;





// Entry rule entryRuleInstTypeLabel
entryRuleInstTypeLabel returns [String current=null] :
	{ currentNode = createCompositeNode(grammarAccess.getInstTypeLabelRule(), currentNode); } 
	 iv_ruleInstTypeLabel=ruleInstTypeLabel 
	 { $current=$iv_ruleInstTypeLabel.current.getText(); }  
	 EOF 
;

// Rule InstTypeLabel
ruleInstTypeLabel returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
	    lastConsumedNode = currentNode;
	    lastConsumedDatatypeToken = $current;
    }:
(
	kw='r' 
    {
        $current.merge(kw);
        createLeafNode(grammarAccess.getInstTypeLabelAccess().getRKeyword_0(), null); 
    }

    |
	kw='i' 
    {
        $current.merge(kw);
        createLeafNode(grammarAccess.getInstTypeLabelAccess().getIKeyword_1(), null); 
    }

    |
	kw='j' 
    {
        $current.merge(kw);
        createLeafNode(grammarAccess.getInstTypeLabelAccess().getJKeyword_2(), null); 
    }
)
    ;





RULE_BINARY : '0x' ('0'..'9'|'A'..'F')+;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


