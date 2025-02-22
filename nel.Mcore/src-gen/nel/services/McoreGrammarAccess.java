/*
* generated by Xtext
*/

package nel.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import org.eclipse.xtext.*;

import org.eclipse.xtext.service.GrammarProvider;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class McoreGrammarAccess implements IGrammarAccess {
	
	
	public class ModelElements implements IParserRuleAccess {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Model");
		private final Assignment cInstructionsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cInstructionsInstructionParserRuleCall_0 = (RuleCall)cInstructionsAssignment.eContents().get(0);
		
		//Model:
		//  instructions+=Instruction*;
		public ParserRule getRule() { return rule; }

		//instructions+=Instruction*
		public Assignment getInstructionsAssignment() { return cInstructionsAssignment; }

		//Instruction
		public RuleCall getInstructionsInstructionParserRuleCall_0() { return cInstructionsInstructionParserRuleCall_0; }
	}

	public class InstructionElements implements IParserRuleAccess {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Instruction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cInstructionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTypeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTypeInstTypeParserRuleCall_3_0 = (RuleCall)cTypeAssignment_3.eContents().get(0);
		private final Assignment cCodingAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cCodingCodingParserRuleCall_4_0 = (RuleCall)cCodingAssignment_4.eContents().get(0);
		private final Assignment cBehaviorAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cBehaviorBehaviorParserRuleCall_5_0 = (RuleCall)cBehaviorAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Instruction:
		//  "instruction" name=ID "{" type=InstType coding=Coding behavior=Behavior "}";
		public ParserRule getRule() { return rule; }

		//"instruction" name=ID "{" type=InstType coding=Coding behavior=Behavior "}"
		public Group getGroup() { return cGroup; }

		//"instruction"
		public Keyword getInstructionKeyword_0() { return cInstructionKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//type=InstType
		public Assignment getTypeAssignment_3() { return cTypeAssignment_3; }

		//InstType
		public RuleCall getTypeInstTypeParserRuleCall_3_0() { return cTypeInstTypeParserRuleCall_3_0; }

		//coding=Coding
		public Assignment getCodingAssignment_4() { return cCodingAssignment_4; }

		//Coding
		public RuleCall getCodingCodingParserRuleCall_4_0() { return cCodingCodingParserRuleCall_4_0; }

		//behavior=Behavior
		public Assignment getBehaviorAssignment_5() { return cBehaviorAssignment_5; }

		//Behavior
		public RuleCall getBehaviorBehaviorParserRuleCall_5_0() { return cBehaviorBehaviorParserRuleCall_5_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}

	public class InstTypeElements implements IParserRuleAccess {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "InstType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTypeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTypeInstTypeLabelParserRuleCall_1_0 = (RuleCall)cTypeAssignment_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//InstType:
		//  "type" type=InstTypeLabel ";";
		public ParserRule getRule() { return rule; }

		//"type" type=InstTypeLabel ";"
		public Group getGroup() { return cGroup; }

		//"type"
		public Keyword getTypeKeyword_0() { return cTypeKeyword_0; }

		//type=InstTypeLabel
		public Assignment getTypeAssignment_1() { return cTypeAssignment_1; }

		//InstTypeLabel
		public RuleCall getTypeInstTypeLabelParserRuleCall_1_0() { return cTypeInstTypeLabelParserRuleCall_1_0; }

		//";"
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}

	public class CodingElements implements IParserRuleAccess {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Coding");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCodingKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cCodingAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cCodingBinaryTerminalRuleCall_1_0 = (RuleCall)cCodingAssignment_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Coding:
		//  "coding" coding=Binary ";";
		public ParserRule getRule() { return rule; }

		//"coding" coding=Binary ";"
		public Group getGroup() { return cGroup; }

		//"coding"
		public Keyword getCodingKeyword_0() { return cCodingKeyword_0; }

		//coding=Binary
		public Assignment getCodingAssignment_1() { return cCodingAssignment_1; }

		//Binary
		public RuleCall getCodingBinaryTerminalRuleCall_1_0() { return cCodingBinaryTerminalRuleCall_1_0; }

		//";"
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}

	public class BehaviorElements implements IParserRuleAccess {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Behavior");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cBehaviorKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Alternatives cAlternatives_2_0 = (Alternatives)cGroup_2.eContents().get(0);
		private final Assignment cExpressionsAssignment_2_0_0 = (Assignment)cAlternatives_2_0.eContents().get(0);
		private final RuleCall cExpressionsExpressionParserRuleCall_2_0_0_0 = (RuleCall)cExpressionsAssignment_2_0_0.eContents().get(0);
		private final Assignment cConditionsAssignment_2_0_1 = (Assignment)cAlternatives_2_0.eContents().get(1);
		private final RuleCall cConditionsConditionParserRuleCall_2_0_1_0 = (RuleCall)cConditionsAssignment_2_0_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Behavior:
		//  "behavior" "{" ((expressions+=Expression|conditions+=Condition) ";")* "}";
		public ParserRule getRule() { return rule; }

		//"behavior" "{" ((expressions+=Expression|conditions+=Condition) ";")* "}"
		public Group getGroup() { return cGroup; }

		//"behavior"
		public Keyword getBehaviorKeyword_0() { return cBehaviorKeyword_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }

		//((expressions+=Expression|conditions+=Condition) ";")*
		public Group getGroup_2() { return cGroup_2; }

		//expressions+=Expression|conditions+=Condition
		public Alternatives getAlternatives_2_0() { return cAlternatives_2_0; }

		//expressions+=Expression
		public Assignment getExpressionsAssignment_2_0_0() { return cExpressionsAssignment_2_0_0; }

		//Expression
		public RuleCall getExpressionsExpressionParserRuleCall_2_0_0_0() { return cExpressionsExpressionParserRuleCall_2_0_0_0; }

		//conditions+=Condition
		public Assignment getConditionsAssignment_2_0_1() { return cConditionsAssignment_2_0_1; }

		//Condition
		public RuleCall getConditionsConditionParserRuleCall_2_0_1_0() { return cConditionsConditionParserRuleCall_2_0_1_0; }

		//";"
		public Keyword getSemicolonKeyword_2_1() { return cSemicolonKeyword_2_1; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
	}

	public class ExpressionElements implements IParserRuleAccess {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Expression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cLexpAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cLexpLExpParserRuleCall_0_0 = (RuleCall)cLexpAssignment_0.eContents().get(0);
		private final Keyword cEqualsSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cRexpAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cRexpRExpParserRuleCall_2_0 = (RuleCall)cRexpAssignment_2.eContents().get(0);
		
		//Expression:
		//  lexp=LExp "=" rexp=RExp;
		public ParserRule getRule() { return rule; }

		//lexp=LExp "=" rexp=RExp
		public Group getGroup() { return cGroup; }

		//lexp=LExp
		public Assignment getLexpAssignment_0() { return cLexpAssignment_0; }

		//LExp
		public RuleCall getLexpLExpParserRuleCall_0_0() { return cLexpLExpParserRuleCall_0_0; }

		//"="
		public Keyword getEqualsSignKeyword_1() { return cEqualsSignKeyword_1; }

		//rexp=RExp
		public Assignment getRexpAssignment_2() { return cRexpAssignment_2; }

		//RExp
		public RuleCall getRexpRExpParserRuleCall_2_0() { return cRexpRExpParserRuleCall_2_0; }
	}

	public class LExpElements implements IParserRuleAccess {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "LExp");
		private final Assignment cRegAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cRegREGSParserRuleCall_0 = (RuleCall)cRegAssignment.eContents().get(0);
		
		//LExp:
		//  reg=REGS;
		public ParserRule getRule() { return rule; }

		//reg=REGS
		public Assignment getRegAssignment() { return cRegAssignment; }

		//REGS
		public RuleCall getRegREGSParserRuleCall_0() { return cRegREGSParserRuleCall_0; }
	}

	public class RExpElements implements IParserRuleAccess {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "RExp");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cArgAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cArgREGSARGSParserRuleCall_0_0 = (RuleCall)cArgAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Assignment cLargAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cLargREGSARGSParserRuleCall_1_0_0 = (RuleCall)cLargAssignment_1_0.eContents().get(0);
		private final Assignment cAopAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cAopAOPsParserRuleCall_1_1_0 = (RuleCall)cAopAssignment_1_1.eContents().get(0);
		private final Assignment cRargAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRargREGSARGSParserRuleCall_1_2_0 = (RuleCall)cRargAssignment_1_2.eContents().get(0);
		
		//RExp:
		//  arg=REGSARGS|larg=REGSARGS aop=AOPs rarg=REGSARGS;
		public ParserRule getRule() { return rule; }

		//arg=REGSARGS|larg=REGSARGS aop=AOPs rarg=REGSARGS
		public Alternatives getAlternatives() { return cAlternatives; }

		//arg=REGSARGS
		public Assignment getArgAssignment_0() { return cArgAssignment_0; }

		//REGSARGS
		public RuleCall getArgREGSARGSParserRuleCall_0_0() { return cArgREGSARGSParserRuleCall_0_0; }

		//larg=REGSARGS aop=AOPs rarg=REGSARGS
		public Group getGroup_1() { return cGroup_1; }

		//larg=REGSARGS
		public Assignment getLargAssignment_1_0() { return cLargAssignment_1_0; }

		//REGSARGS
		public RuleCall getLargREGSARGSParserRuleCall_1_0_0() { return cLargREGSARGSParserRuleCall_1_0_0; }

		//aop=AOPs
		public Assignment getAopAssignment_1_1() { return cAopAssignment_1_1; }

		//AOPs
		public RuleCall getAopAOPsParserRuleCall_1_1_0() { return cAopAOPsParserRuleCall_1_1_0; }

		//rarg=REGSARGS
		public Assignment getRargAssignment_1_2() { return cRargAssignment_1_2; }

		//REGSARGS
		public RuleCall getRargREGSARGSParserRuleCall_1_2_0() { return cRargREGSARGSParserRuleCall_1_2_0; }
	}

	public class ConditionElements implements IParserRuleAccess {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Condition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cIfKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cLargAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cLargREGSARGSParserRuleCall_2_0 = (RuleCall)cLargAssignment_2.eContents().get(0);
		private final Assignment cCmpopAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cCmpopCMPOPsParserRuleCall_3_0 = (RuleCall)cCmpopAssignment_3.eContents().get(0);
		private final Assignment cRargAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cRargREGSARGSParserRuleCall_4_0 = (RuleCall)cRargAssignment_4.eContents().get(0);
		private final Keyword cCommaKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cThentargetAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cThentargetJMPTARGETParserRuleCall_6_0 = (RuleCall)cThentargetAssignment_6.eContents().get(0);
		private final Keyword cCommaKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cElsetargetAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cElsetargetJMPTARGETParserRuleCall_8_0 = (RuleCall)cElsetargetAssignment_8.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//Condition:
		//  "if" "(" larg=REGSARGS cmpop=CMPOPs rarg=REGSARGS "," thentarget=JMPTARGET ","
		//  elsetarget=JMPTARGET ")";
		public ParserRule getRule() { return rule; }

		//"if" "(" larg=REGSARGS cmpop=CMPOPs rarg=REGSARGS "," thentarget=JMPTARGET ","
		//elsetarget=JMPTARGET ")"
		public Group getGroup() { return cGroup; }

		//"if"
		public Keyword getIfKeyword_0() { return cIfKeyword_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }

		//larg=REGSARGS
		public Assignment getLargAssignment_2() { return cLargAssignment_2; }

		//REGSARGS
		public RuleCall getLargREGSARGSParserRuleCall_2_0() { return cLargREGSARGSParserRuleCall_2_0; }

		//cmpop=CMPOPs
		public Assignment getCmpopAssignment_3() { return cCmpopAssignment_3; }

		//CMPOPs
		public RuleCall getCmpopCMPOPsParserRuleCall_3_0() { return cCmpopCMPOPsParserRuleCall_3_0; }

		//rarg=REGSARGS
		public Assignment getRargAssignment_4() { return cRargAssignment_4; }

		//REGSARGS
		public RuleCall getRargREGSARGSParserRuleCall_4_0() { return cRargREGSARGSParserRuleCall_4_0; }

		//","
		public Keyword getCommaKeyword_5() { return cCommaKeyword_5; }

		//thentarget=JMPTARGET
		public Assignment getThentargetAssignment_6() { return cThentargetAssignment_6; }

		//JMPTARGET
		public RuleCall getThentargetJMPTARGETParserRuleCall_6_0() { return cThentargetJMPTARGETParserRuleCall_6_0; }

		//","
		public Keyword getCommaKeyword_7() { return cCommaKeyword_7; }

		//elsetarget=JMPTARGET
		public Assignment getElsetargetAssignment_8() { return cElsetargetAssignment_8; }

		//JMPTARGET
		public RuleCall getElsetargetJMPTARGETParserRuleCall_8_0() { return cElsetargetJMPTARGETParserRuleCall_8_0; }

		//")"
		public Keyword getRightParenthesisKeyword_9() { return cRightParenthesisKeyword_9; }
	}

	public class REGSARGSElements implements IParserRuleAccess {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "REGSARGS");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cRegAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cRegREGSParserRuleCall_0_0 = (RuleCall)cRegAssignment_0.eContents().get(0);
		private final Assignment cArgAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cArgARGSParserRuleCall_1_0 = (RuleCall)cArgAssignment_1.eContents().get(0);
		
		//REGSARGS:
		//  reg=REGS|arg=ARGS;
		public ParserRule getRule() { return rule; }

		//reg=REGS|arg=ARGS
		public Alternatives getAlternatives() { return cAlternatives; }

		//reg=REGS
		public Assignment getRegAssignment_0() { return cRegAssignment_0; }

		//REGS
		public RuleCall getRegREGSParserRuleCall_0_0() { return cRegREGSParserRuleCall_0_0; }

		//arg=ARGS
		public Assignment getArgAssignment_1() { return cArgAssignment_1; }

		//ARGS
		public RuleCall getArgARGSParserRuleCall_1_0() { return cArgARGSParserRuleCall_1_0; }
	}

	public class JMPTARGETElements implements IParserRuleAccess {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "JMPTARGET");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cIMKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cNEXTKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		
		//JMPTARGET returns ecore::EString:
		//  "IM"|"NEXT";
		public ParserRule getRule() { return rule; }

		//"IM"|"NEXT"
		public Alternatives getAlternatives() { return cAlternatives; }

		//"IM"
		public Keyword getIMKeyword_0() { return cIMKeyword_0; }

		//"NEXT"
		public Keyword getNEXTKeyword_1() { return cNEXTKeyword_1; }
	}

	public class REGSElements implements IParserRuleAccess {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "REGS");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRegsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cArgAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cArgARGSParserRuleCall_2_0 = (RuleCall)cArgAssignment_2.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//REGS:
		//  "regs" "[" arg=ARGS "]";
		public ParserRule getRule() { return rule; }

		//"regs" "[" arg=ARGS "]"
		public Group getGroup() { return cGroup; }

		//"regs"
		public Keyword getRegsKeyword_0() { return cRegsKeyword_0; }

		//"["
		public Keyword getLeftSquareBracketKeyword_1() { return cLeftSquareBracketKeyword_1; }

		//arg=ARGS
		public Assignment getArgAssignment_2() { return cArgAssignment_2; }

		//ARGS
		public RuleCall getArgARGSParserRuleCall_2_0() { return cArgARGSParserRuleCall_2_0; }

		//"]"
		public Keyword getRightSquareBracketKeyword_3() { return cRightSquareBracketKeyword_3; }
	}

	public class ARGSElements implements IParserRuleAccess {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ARGS");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cIMKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cRDKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cRSKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		private final Keyword cRTKeyword_3 = (Keyword)cAlternatives.eContents().get(3);
		private final Keyword cAddrKeyword_4 = (Keyword)cAlternatives.eContents().get(4);
		
		//ARGS returns ecore::EString:
		//  "IM"|"RD"|"RS"|"RT"|"addr";
		public ParserRule getRule() { return rule; }

		//"IM"|"RD"|"RS"|"RT"|"addr"
		public Alternatives getAlternatives() { return cAlternatives; }

		//"IM"
		public Keyword getIMKeyword_0() { return cIMKeyword_0; }

		//"RD"
		public Keyword getRDKeyword_1() { return cRDKeyword_1; }

		//"RS"
		public Keyword getRSKeyword_2() { return cRSKeyword_2; }

		//"RT"
		public Keyword getRTKeyword_3() { return cRTKeyword_3; }

		//"addr"
		public Keyword getAddrKeyword_4() { return cAddrKeyword_4; }
	}

	public class AOPsElements implements IParserRuleAccess {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AOPs");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cPlusSignKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cHyphenMinusKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cAsteriskKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		private final Keyword cSolidusKeyword_3 = (Keyword)cAlternatives.eContents().get(3);
		
		//AOPs returns ecore::EString:
		//  "+"|"-"|"*"|"/";
		public ParserRule getRule() { return rule; }

		//"+"|"-"|"*"|"/"
		public Alternatives getAlternatives() { return cAlternatives; }

		//"+"
		public Keyword getPlusSignKeyword_0() { return cPlusSignKeyword_0; }

		//"-"
		public Keyword getHyphenMinusKeyword_1() { return cHyphenMinusKeyword_1; }

		//"*"
		public Keyword getAsteriskKeyword_2() { return cAsteriskKeyword_2; }

		//"/"
		public Keyword getSolidusKeyword_3() { return cSolidusKeyword_3; }
	}

	public class CMPOPsElements implements IParserRuleAccess {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "CMPOPs");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cEqualsSignEqualsSignKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cExclamationMarkEqualsSignKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cLessThanSignKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		private final Keyword cGreaterThanSignKeyword_3 = (Keyword)cAlternatives.eContents().get(3);
		private final Keyword cLessThanSignEqualsSignKeyword_4 = (Keyword)cAlternatives.eContents().get(4);
		private final Keyword cGreaterThanSignEqualsSignKeyword_5 = (Keyword)cAlternatives.eContents().get(5);
		
		//CMPOPs returns ecore::EString:
		//  "=="|"!="|"<"|">"|"<="|">=";
		public ParserRule getRule() { return rule; }

		//"=="|"!="|"<"|">"|"<="|">="
		public Alternatives getAlternatives() { return cAlternatives; }

		//"=="
		public Keyword getEqualsSignEqualsSignKeyword_0() { return cEqualsSignEqualsSignKeyword_0; }

		//"!="
		public Keyword getExclamationMarkEqualsSignKeyword_1() { return cExclamationMarkEqualsSignKeyword_1; }

		//"<"
		public Keyword getLessThanSignKeyword_2() { return cLessThanSignKeyword_2; }

		//">"
		public Keyword getGreaterThanSignKeyword_3() { return cGreaterThanSignKeyword_3; }

		//"<="
		public Keyword getLessThanSignEqualsSignKeyword_4() { return cLessThanSignEqualsSignKeyword_4; }

		//">="
		public Keyword getGreaterThanSignEqualsSignKeyword_5() { return cGreaterThanSignEqualsSignKeyword_5; }
	}

	public class InstTypeLabelElements implements IParserRuleAccess {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "InstTypeLabel");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cRKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cIKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cJKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		
		//InstTypeLabel returns ecore::EString:
		//  "r"|"i"|"j";
		public ParserRule getRule() { return rule; }

		//"r"|"i"|"j"
		public Alternatives getAlternatives() { return cAlternatives; }

		//"r"
		public Keyword getRKeyword_0() { return cRKeyword_0; }

		//"i"
		public Keyword getIKeyword_1() { return cIKeyword_1; }

		//"j"
		public Keyword getJKeyword_2() { return cJKeyword_2; }
	}
	
	
	private ModelElements pModel;
	private InstructionElements pInstruction;
	private InstTypeElements pInstType;
	private CodingElements pCoding;
	private BehaviorElements pBehavior;
	private ExpressionElements pExpression;
	private LExpElements pLExp;
	private RExpElements pRExp;
	private ConditionElements pCondition;
	private REGSARGSElements pREGSARGS;
	private JMPTARGETElements pJMPTARGET;
	private REGSElements pREGS;
	private ARGSElements pARGS;
	private AOPsElements pAOPs;
	private CMPOPsElements pCMPOPs;
	private InstTypeLabelElements pInstTypeLabel;
	private TerminalRule tBinary;
	
	private final GrammarProvider grammarProvider;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public McoreGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammarProvider = grammarProvider;
		this.gaTerminals = gaTerminals;
	}
	
	public Grammar getGrammar() {	
		return grammarProvider.getGrammar(this);
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//  instructions+=Instruction*;
	public ModelElements getModelAccess() {
		return (pModel != null) ? pModel : (pModel = new ModelElements());
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}

	//Instruction:
	//  "instruction" name=ID "{" type=InstType coding=Coding behavior=Behavior "}";
	public InstructionElements getInstructionAccess() {
		return (pInstruction != null) ? pInstruction : (pInstruction = new InstructionElements());
	}
	
	public ParserRule getInstructionRule() {
		return getInstructionAccess().getRule();
	}

	//InstType:
	//  "type" type=InstTypeLabel ";";
	public InstTypeElements getInstTypeAccess() {
		return (pInstType != null) ? pInstType : (pInstType = new InstTypeElements());
	}
	
	public ParserRule getInstTypeRule() {
		return getInstTypeAccess().getRule();
	}

	//Coding:
	//  "coding" coding=Binary ";";
	public CodingElements getCodingAccess() {
		return (pCoding != null) ? pCoding : (pCoding = new CodingElements());
	}
	
	public ParserRule getCodingRule() {
		return getCodingAccess().getRule();
	}

	//Behavior:
	//  "behavior" "{" ((expressions+=Expression|conditions+=Condition) ";")* "}";
	public BehaviorElements getBehaviorAccess() {
		return (pBehavior != null) ? pBehavior : (pBehavior = new BehaviorElements());
	}
	
	public ParserRule getBehaviorRule() {
		return getBehaviorAccess().getRule();
	}

	//Expression:
	//  lexp=LExp "=" rexp=RExp;
	public ExpressionElements getExpressionAccess() {
		return (pExpression != null) ? pExpression : (pExpression = new ExpressionElements());
	}
	
	public ParserRule getExpressionRule() {
		return getExpressionAccess().getRule();
	}

	//LExp:
	//  reg=REGS;
	public LExpElements getLExpAccess() {
		return (pLExp != null) ? pLExp : (pLExp = new LExpElements());
	}
	
	public ParserRule getLExpRule() {
		return getLExpAccess().getRule();
	}

	//RExp:
	//  arg=REGSARGS|larg=REGSARGS aop=AOPs rarg=REGSARGS;
	public RExpElements getRExpAccess() {
		return (pRExp != null) ? pRExp : (pRExp = new RExpElements());
	}
	
	public ParserRule getRExpRule() {
		return getRExpAccess().getRule();
	}

	//Condition:
	//  "if" "(" larg=REGSARGS cmpop=CMPOPs rarg=REGSARGS "," thentarget=JMPTARGET ","
	//  elsetarget=JMPTARGET ")";
	public ConditionElements getConditionAccess() {
		return (pCondition != null) ? pCondition : (pCondition = new ConditionElements());
	}
	
	public ParserRule getConditionRule() {
		return getConditionAccess().getRule();
	}

	//REGSARGS:
	//  reg=REGS|arg=ARGS;
	public REGSARGSElements getREGSARGSAccess() {
		return (pREGSARGS != null) ? pREGSARGS : (pREGSARGS = new REGSARGSElements());
	}
	
	public ParserRule getREGSARGSRule() {
		return getREGSARGSAccess().getRule();
	}

	//JMPTARGET returns ecore::EString:
	//  "IM"|"NEXT";
	public JMPTARGETElements getJMPTARGETAccess() {
		return (pJMPTARGET != null) ? pJMPTARGET : (pJMPTARGET = new JMPTARGETElements());
	}
	
	public ParserRule getJMPTARGETRule() {
		return getJMPTARGETAccess().getRule();
	}

	//REGS:
	//  "regs" "[" arg=ARGS "]";
	public REGSElements getREGSAccess() {
		return (pREGS != null) ? pREGS : (pREGS = new REGSElements());
	}
	
	public ParserRule getREGSRule() {
		return getREGSAccess().getRule();
	}

	//ARGS returns ecore::EString:
	//  "IM"|"RD"|"RS"|"RT"|"addr";
	public ARGSElements getARGSAccess() {
		return (pARGS != null) ? pARGS : (pARGS = new ARGSElements());
	}
	
	public ParserRule getARGSRule() {
		return getARGSAccess().getRule();
	}

	//AOPs returns ecore::EString:
	//  "+"|"-"|"*"|"/";
	public AOPsElements getAOPsAccess() {
		return (pAOPs != null) ? pAOPs : (pAOPs = new AOPsElements());
	}
	
	public ParserRule getAOPsRule() {
		return getAOPsAccess().getRule();
	}

	//CMPOPs returns ecore::EString:
	//  "=="|"!="|"<"|">"|"<="|">=";
	public CMPOPsElements getCMPOPsAccess() {
		return (pCMPOPs != null) ? pCMPOPs : (pCMPOPs = new CMPOPsElements());
	}
	
	public ParserRule getCMPOPsRule() {
		return getCMPOPsAccess().getRule();
	}

	//InstTypeLabel returns ecore::EString:
	//  "r"|"i"|"j";
	public InstTypeLabelElements getInstTypeLabelAccess() {
		return (pInstTypeLabel != null) ? pInstTypeLabel : (pInstTypeLabel = new InstTypeLabelElements());
	}
	
	public ParserRule getInstTypeLabelRule() {
		return getInstTypeLabelAccess().getRule();
	}

	//terminal Binary:
	//  "0x" ("0".."9" | "A".."F")+;
	public TerminalRule getBinaryRule() {
		return (tBinary != null) ? tBinary : (tBinary = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "Binary"));
	} 

	//terminal ID:
	//  "^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//  "0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//  "\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" |
	//  "t" | "n" | "f" | "r" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//  "/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//  "//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//  (" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//  .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
