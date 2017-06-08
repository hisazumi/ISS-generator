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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalMcoreParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_BINARY", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'instruction'", "'{'", "'}'", "'type'", "';'", "'coding'", "'behavior'", "'='", "'if'", "'('", "','", "')'", "'IM'", "'NEXT'", "'regs'", "'['", "']'", "'RD'", "'RS'", "'RT'", "'addr'", "'+'", "'-'", "'*'", "'/'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'r'", "'i'", "'j'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=7;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=6;
    public static final int RULE_BINARY=5;
    public static final int RULE_WS=10;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;

        public InternalMcoreParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g"; }


     
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



    // $ANTLR start entryRuleModel
    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:72:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:72:47: (iv_ruleModel= ruleModel EOF )
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:73:2: iv_ruleModel= ruleModel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModelRule(), currentNode); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel73);
            iv_ruleModel=ruleModel();
            _fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel83); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleModel


    // $ANTLR start ruleModel
    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:80:1: ruleModel returns [EObject current=null] : (lv_instructions_0= ruleInstruction )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_instructions_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:85:6: ( (lv_instructions_0= ruleInstruction )* )
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:86:1: (lv_instructions_0= ruleInstruction )*
            {
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:86:1: (lv_instructions_0= ruleInstruction )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:89:6: lv_instructions_0= ruleInstruction
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getInstructionsInstructionParserRuleCall_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleInstruction_in_ruleModel141);
            	    lv_instructions_0=ruleInstruction();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "instructions", lv_instructions_0, "Instruction", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleModel


    // $ANTLR start entryRuleInstruction
    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:114:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:114:53: (iv_ruleInstruction= ruleInstruction EOF )
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:115:2: iv_ruleInstruction= ruleInstruction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInstructionRule(), currentNode); 
            pushFollow(FOLLOW_ruleInstruction_in_entryRuleInstruction178);
            iv_ruleInstruction=ruleInstruction();
            _fsp--;

             current =iv_ruleInstruction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstruction188); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleInstruction


    // $ANTLR start ruleInstruction
    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:122:1: ruleInstruction returns [EObject current=null] : ( 'instruction' (lv_name_1= RULE_ID ) '{' (lv_type_3= ruleInstType ) (lv_coding_4= ruleCoding ) (lv_behavior_5= ruleBehavior ) '}' ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;
        EObject lv_type_3 = null;

        EObject lv_coding_4 = null;

        EObject lv_behavior_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:127:6: ( ( 'instruction' (lv_name_1= RULE_ID ) '{' (lv_type_3= ruleInstType ) (lv_coding_4= ruleCoding ) (lv_behavior_5= ruleBehavior ) '}' ) )
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:128:1: ( 'instruction' (lv_name_1= RULE_ID ) '{' (lv_type_3= ruleInstType ) (lv_coding_4= ruleCoding ) (lv_behavior_5= ruleBehavior ) '}' )
            {
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:128:1: ( 'instruction' (lv_name_1= RULE_ID ) '{' (lv_type_3= ruleInstType ) (lv_coding_4= ruleCoding ) (lv_behavior_5= ruleBehavior ) '}' )
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:128:2: 'instruction' (lv_name_1= RULE_ID ) '{' (lv_type_3= ruleInstType ) (lv_coding_4= ruleCoding ) (lv_behavior_5= ruleBehavior ) '}'
            {
            match(input,12,FOLLOW_12_in_ruleInstruction222); 

                    createLeafNode(grammarAccess.getInstructionAccess().getInstructionKeyword_0(), null); 
                
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:132:1: (lv_name_1= RULE_ID )
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:134:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInstruction244); 

            		createLeafNode(grammarAccess.getInstructionAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getInstructionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_1, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,13,FOLLOW_13_in_ruleInstruction261); 

                    createLeafNode(grammarAccess.getInstructionAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:156:1: (lv_type_3= ruleInstType )
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:159:6: lv_type_3= ruleInstType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getInstructionAccess().getTypeInstTypeParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleInstType_in_ruleInstruction295);
            lv_type_3=ruleInstType();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getInstructionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "type", lv_type_3, "InstType", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:177:2: (lv_coding_4= ruleCoding )
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:180:6: lv_coding_4= ruleCoding
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getInstructionAccess().getCodingCodingParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleCoding_in_ruleInstruction333);
            lv_coding_4=ruleCoding();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getInstructionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "coding", lv_coding_4, "Coding", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:198:2: (lv_behavior_5= ruleBehavior )
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:201:6: lv_behavior_5= ruleBehavior
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getInstructionAccess().getBehaviorBehaviorParserRuleCall_5_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBehavior_in_ruleInstruction371);
            lv_behavior_5=ruleBehavior();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getInstructionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "behavior", lv_behavior_5, "Behavior", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,14,FOLLOW_14_in_ruleInstruction384); 

                    createLeafNode(grammarAccess.getInstructionAccess().getRightCurlyBracketKeyword_6(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleInstruction


    // $ANTLR start entryRuleInstType
    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:230:1: entryRuleInstType returns [EObject current=null] : iv_ruleInstType= ruleInstType EOF ;
    public final EObject entryRuleInstType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstType = null;


        try {
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:230:50: (iv_ruleInstType= ruleInstType EOF )
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:231:2: iv_ruleInstType= ruleInstType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInstTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleInstType_in_entryRuleInstType417);
            iv_ruleInstType=ruleInstType();
            _fsp--;

             current =iv_ruleInstType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstType427); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleInstType


    // $ANTLR start ruleInstType
    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:238:1: ruleInstType returns [EObject current=null] : ( 'type' (lv_type_1= ruleInstTypeLabel ) ';' ) ;
    public final EObject ruleInstType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_type_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:243:6: ( ( 'type' (lv_type_1= ruleInstTypeLabel ) ';' ) )
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:244:1: ( 'type' (lv_type_1= ruleInstTypeLabel ) ';' )
            {
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:244:1: ( 'type' (lv_type_1= ruleInstTypeLabel ) ';' )
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:244:2: 'type' (lv_type_1= ruleInstTypeLabel ) ';'
            {
            match(input,15,FOLLOW_15_in_ruleInstType461); 

                    createLeafNode(grammarAccess.getInstTypeAccess().getTypeKeyword_0(), null); 
                
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:248:1: (lv_type_1= ruleInstTypeLabel )
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:251:6: lv_type_1= ruleInstTypeLabel
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getInstTypeAccess().getTypeInstTypeLabelParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleInstTypeLabel_in_ruleInstType495);
            lv_type_1=ruleInstTypeLabel();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getInstTypeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "type", lv_type_1, "InstTypeLabel", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,16,FOLLOW_16_in_ruleInstType508); 

                    createLeafNode(grammarAccess.getInstTypeAccess().getSemicolonKeyword_2(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleInstType


    // $ANTLR start entryRuleCoding
    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:280:1: entryRuleCoding returns [EObject current=null] : iv_ruleCoding= ruleCoding EOF ;
    public final EObject entryRuleCoding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoding = null;


        try {
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:280:48: (iv_ruleCoding= ruleCoding EOF )
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:281:2: iv_ruleCoding= ruleCoding EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCodingRule(), currentNode); 
            pushFollow(FOLLOW_ruleCoding_in_entryRuleCoding541);
            iv_ruleCoding=ruleCoding();
            _fsp--;

             current =iv_ruleCoding; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCoding551); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCoding


    // $ANTLR start ruleCoding
    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:288:1: ruleCoding returns [EObject current=null] : ( 'coding' (lv_coding_1= RULE_BINARY ) ';' ) ;
    public final EObject ruleCoding() throws RecognitionException {
        EObject current = null;

        Token lv_coding_1=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:293:6: ( ( 'coding' (lv_coding_1= RULE_BINARY ) ';' ) )
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:294:1: ( 'coding' (lv_coding_1= RULE_BINARY ) ';' )
            {
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:294:1: ( 'coding' (lv_coding_1= RULE_BINARY ) ';' )
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:294:2: 'coding' (lv_coding_1= RULE_BINARY ) ';'
            {
            match(input,17,FOLLOW_17_in_ruleCoding585); 

                    createLeafNode(grammarAccess.getCodingAccess().getCodingKeyword_0(), null); 
                
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:298:1: (lv_coding_1= RULE_BINARY )
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:300:6: lv_coding_1= RULE_BINARY
            {
            lv_coding_1=(Token)input.LT(1);
            match(input,RULE_BINARY,FOLLOW_RULE_BINARY_in_ruleCoding607); 

            		createLeafNode(grammarAccess.getCodingAccess().getCodingBinaryTerminalRuleCall_1_0(), "coding"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCodingRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "coding", lv_coding_1, "Binary", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,16,FOLLOW_16_in_ruleCoding624); 

                    createLeafNode(grammarAccess.getCodingAccess().getSemicolonKeyword_2(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCoding


    // $ANTLR start entryRuleBehavior
    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:329:1: entryRuleBehavior returns [EObject current=null] : iv_ruleBehavior= ruleBehavior EOF ;
    public final EObject entryRuleBehavior() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehavior = null;


        try {
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:329:50: (iv_ruleBehavior= ruleBehavior EOF )
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:330:2: iv_ruleBehavior= ruleBehavior EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBehaviorRule(), currentNode); 
            pushFollow(FOLLOW_ruleBehavior_in_entryRuleBehavior657);
            iv_ruleBehavior=ruleBehavior();
            _fsp--;

             current =iv_ruleBehavior; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBehavior667); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBehavior


    // $ANTLR start ruleBehavior
    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:337:1: ruleBehavior returns [EObject current=null] : ( 'behavior' '{' ( ( (lv_expressions_2= ruleExpression ) | (lv_conditions_3= ruleCondition ) ) ';' )* '}' ) ;
    public final EObject ruleBehavior() throws RecognitionException {
        EObject current = null;

        EObject lv_expressions_2 = null;

        EObject lv_conditions_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:342:6: ( ( 'behavior' '{' ( ( (lv_expressions_2= ruleExpression ) | (lv_conditions_3= ruleCondition ) ) ';' )* '}' ) )
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:343:1: ( 'behavior' '{' ( ( (lv_expressions_2= ruleExpression ) | (lv_conditions_3= ruleCondition ) ) ';' )* '}' )
            {
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:343:1: ( 'behavior' '{' ( ( (lv_expressions_2= ruleExpression ) | (lv_conditions_3= ruleCondition ) ) ';' )* '}' )
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:343:2: 'behavior' '{' ( ( (lv_expressions_2= ruleExpression ) | (lv_conditions_3= ruleCondition ) ) ';' )* '}'
            {
            match(input,18,FOLLOW_18_in_ruleBehavior701); 

                    createLeafNode(grammarAccess.getBehaviorAccess().getBehaviorKeyword_0(), null); 
                
            match(input,13,FOLLOW_13_in_ruleBehavior710); 

                    createLeafNode(grammarAccess.getBehaviorAccess().getLeftCurlyBracketKeyword_1(), null); 
                
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:351:1: ( ( (lv_expressions_2= ruleExpression ) | (lv_conditions_3= ruleCondition ) ) ';' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==20||LA3_0==26) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:351:2: ( (lv_expressions_2= ruleExpression ) | (lv_conditions_3= ruleCondition ) ) ';'
            	    {
            	    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:351:2: ( (lv_expressions_2= ruleExpression ) | (lv_conditions_3= ruleCondition ) )
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==26) ) {
            	        alt2=1;
            	    }
            	    else if ( (LA2_0==20) ) {
            	        alt2=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("351:2: ( (lv_expressions_2= ruleExpression ) | (lv_conditions_3= ruleCondition ) )", 2, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:351:3: (lv_expressions_2= ruleExpression )
            	            {
            	            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:351:3: (lv_expressions_2= ruleExpression )
            	            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:354:6: lv_expressions_2= ruleExpression
            	            {
            	             
            	            	        currentNode=createCompositeNode(grammarAccess.getBehaviorAccess().getExpressionsExpressionParserRuleCall_2_0_0_0(), currentNode); 
            	            	    
            	            pushFollow(FOLLOW_ruleExpression_in_ruleBehavior746);
            	            lv_expressions_2=ruleExpression();
            	            _fsp--;


            	            	        if (current==null) {
            	            	            current = factory.create(grammarAccess.getBehaviorRule().getType().getClassifier());
            	            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	            	        }
            	            	        
            	            	        try {
            	            	       		add(current, "expressions", lv_expressions_2, "Expression", currentNode);
            	            	        } catch (ValueConverterException vce) {
            	            				handleValueConverterException(vce);
            	            	        }
            	            	        currentNode = currentNode.getParent();
            	            	    

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:373:6: (lv_conditions_3= ruleCondition )
            	            {
            	            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:373:6: (lv_conditions_3= ruleCondition )
            	            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:376:6: lv_conditions_3= ruleCondition
            	            {
            	             
            	            	        currentNode=createCompositeNode(grammarAccess.getBehaviorAccess().getConditionsConditionParserRuleCall_2_0_1_0(), currentNode); 
            	            	    
            	            pushFollow(FOLLOW_ruleCondition_in_ruleBehavior790);
            	            lv_conditions_3=ruleCondition();
            	            _fsp--;


            	            	        if (current==null) {
            	            	            current = factory.create(grammarAccess.getBehaviorRule().getType().getClassifier());
            	            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	            	        }
            	            	        
            	            	        try {
            	            	       		add(current, "conditions", lv_conditions_3, "Condition", currentNode);
            	            	        } catch (ValueConverterException vce) {
            	            				handleValueConverterException(vce);
            	            	        }
            	            	        currentNode = currentNode.getParent();
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    match(input,16,FOLLOW_16_in_ruleBehavior804); 

            	            createLeafNode(grammarAccess.getBehaviorAccess().getSemicolonKeyword_2_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match(input,14,FOLLOW_14_in_ruleBehavior815); 

                    createLeafNode(grammarAccess.getBehaviorAccess().getRightCurlyBracketKeyword_3(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBehavior


    // $ANTLR start entryRuleExpression
    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:409:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:409:52: (iv_ruleExpression= ruleExpression EOF )
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:410:2: iv_ruleExpression= ruleExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression848);
            iv_ruleExpression=ruleExpression();
            _fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression858); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleExpression


    // $ANTLR start ruleExpression
    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:417:1: ruleExpression returns [EObject current=null] : ( (lv_lexp_0= ruleLExp ) '=' (lv_rexp_2= ruleRExp ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_lexp_0 = null;

        EObject lv_rexp_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:422:6: ( ( (lv_lexp_0= ruleLExp ) '=' (lv_rexp_2= ruleRExp ) ) )
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:423:1: ( (lv_lexp_0= ruleLExp ) '=' (lv_rexp_2= ruleRExp ) )
            {
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:423:1: ( (lv_lexp_0= ruleLExp ) '=' (lv_rexp_2= ruleRExp ) )
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:423:2: (lv_lexp_0= ruleLExp ) '=' (lv_rexp_2= ruleRExp )
            {
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:423:2: (lv_lexp_0= ruleLExp )
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:426:6: lv_lexp_0= ruleLExp
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getLexpLExpParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleLExp_in_ruleExpression917);
            lv_lexp_0=ruleLExp();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "lexp", lv_lexp_0, "LExp", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,19,FOLLOW_19_in_ruleExpression930); 

                    createLeafNode(grammarAccess.getExpressionAccess().getEqualsSignKeyword_1(), null); 
                
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:448:1: (lv_rexp_2= ruleRExp )
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:451:6: lv_rexp_2= ruleRExp
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getRexpRExpParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleRExp_in_ruleExpression964);
            lv_rexp_2=ruleRExp();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "rexp", lv_rexp_2, "RExp", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleExpression


    // $ANTLR start entryRuleLExp
    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:476:1: entryRuleLExp returns [EObject current=null] : iv_ruleLExp= ruleLExp EOF ;
    public final EObject entryRuleLExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLExp = null;


        try {
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:476:46: (iv_ruleLExp= ruleLExp EOF )
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:477:2: iv_ruleLExp= ruleLExp EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLExpRule(), currentNode); 
            pushFollow(FOLLOW_ruleLExp_in_entryRuleLExp1001);
            iv_ruleLExp=ruleLExp();
            _fsp--;

             current =iv_ruleLExp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLExp1011); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLExp


    // $ANTLR start ruleLExp
    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:484:1: ruleLExp returns [EObject current=null] : (lv_reg_0= ruleREGS ) ;
    public final EObject ruleLExp() throws RecognitionException {
        EObject current = null;

        EObject lv_reg_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:489:6: ( (lv_reg_0= ruleREGS ) )
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:490:1: (lv_reg_0= ruleREGS )
            {
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:490:1: (lv_reg_0= ruleREGS )
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:493:6: lv_reg_0= ruleREGS
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getLExpAccess().getRegREGSParserRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleREGS_in_ruleLExp1069);
            lv_reg_0=ruleREGS();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLExpRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "reg", lv_reg_0, "REGS", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleLExp


    // $ANTLR start entryRuleRExp
    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:518:1: entryRuleRExp returns [EObject current=null] : iv_ruleRExp= ruleRExp EOF ;
    public final EObject entryRuleRExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRExp = null;


        try {
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:518:46: (iv_ruleRExp= ruleRExp EOF )
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:519:2: iv_ruleRExp= ruleRExp EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRExpRule(), currentNode); 
            pushFollow(FOLLOW_ruleRExp_in_entryRuleRExp1105);
            iv_ruleRExp=ruleRExp();
            _fsp--;

             current =iv_ruleRExp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRExp1115); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleRExp


    // $ANTLR start ruleRExp
    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:526:1: ruleRExp returns [EObject current=null] : ( (lv_arg_0= ruleREGSARGS ) | ( (lv_larg_1= ruleREGSARGS ) (lv_aop_2= ruleAOPs ) (lv_rarg_3= ruleREGSARGS ) ) ) ;
    public final EObject ruleRExp() throws RecognitionException {
        EObject current = null;

        EObject lv_arg_0 = null;

        EObject lv_larg_1 = null;

        AntlrDatatypeRuleToken lv_aop_2 = null;

        EObject lv_rarg_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:531:6: ( ( (lv_arg_0= ruleREGSARGS ) | ( (lv_larg_1= ruleREGSARGS ) (lv_aop_2= ruleAOPs ) (lv_rarg_3= ruleREGSARGS ) ) ) )
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:532:1: ( (lv_arg_0= ruleREGSARGS ) | ( (lv_larg_1= ruleREGSARGS ) (lv_aop_2= ruleAOPs ) (lv_rarg_3= ruleREGSARGS ) ) )
            {
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:532:1: ( (lv_arg_0= ruleREGSARGS ) | ( (lv_larg_1= ruleREGSARGS ) (lv_aop_2= ruleAOPs ) (lv_rarg_3= ruleREGSARGS ) ) )
            int alt4=2;
            switch ( input.LA(1) ) {
            case 26:
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==27) ) {
                    switch ( input.LA(3) ) {
                    case 24:
                        {
                        int LA4_10 = input.LA(4);

                        if ( (LA4_10==28) ) {
                            int LA4_15 = input.LA(5);

                            if ( (LA4_15==EOF||LA4_15==16) ) {
                                alt4=1;
                            }
                            else if ( ((LA4_15>=33 && LA4_15<=36)) ) {
                                alt4=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("532:1: ( (lv_arg_0= ruleREGSARGS ) | ( (lv_larg_1= ruleREGSARGS ) (lv_aop_2= ruleAOPs ) (lv_rarg_3= ruleREGSARGS ) ) )", 4, 15, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("532:1: ( (lv_arg_0= ruleREGSARGS ) | ( (lv_larg_1= ruleREGSARGS ) (lv_aop_2= ruleAOPs ) (lv_rarg_3= ruleREGSARGS ) ) )", 4, 10, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 29:
                        {
                        int LA4_11 = input.LA(4);

                        if ( (LA4_11==28) ) {
                            int LA4_15 = input.LA(5);

                            if ( (LA4_15==EOF||LA4_15==16) ) {
                                alt4=1;
                            }
                            else if ( ((LA4_15>=33 && LA4_15<=36)) ) {
                                alt4=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("532:1: ( (lv_arg_0= ruleREGSARGS ) | ( (lv_larg_1= ruleREGSARGS ) (lv_aop_2= ruleAOPs ) (lv_rarg_3= ruleREGSARGS ) ) )", 4, 15, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("532:1: ( (lv_arg_0= ruleREGSARGS ) | ( (lv_larg_1= ruleREGSARGS ) (lv_aop_2= ruleAOPs ) (lv_rarg_3= ruleREGSARGS ) ) )", 4, 11, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 30:
                        {
                        int LA4_12 = input.LA(4);

                        if ( (LA4_12==28) ) {
                            int LA4_15 = input.LA(5);

                            if ( (LA4_15==EOF||LA4_15==16) ) {
                                alt4=1;
                            }
                            else if ( ((LA4_15>=33 && LA4_15<=36)) ) {
                                alt4=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("532:1: ( (lv_arg_0= ruleREGSARGS ) | ( (lv_larg_1= ruleREGSARGS ) (lv_aop_2= ruleAOPs ) (lv_rarg_3= ruleREGSARGS ) ) )", 4, 15, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("532:1: ( (lv_arg_0= ruleREGSARGS ) | ( (lv_larg_1= ruleREGSARGS ) (lv_aop_2= ruleAOPs ) (lv_rarg_3= ruleREGSARGS ) ) )", 4, 12, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 31:
                        {
                        int LA4_13 = input.LA(4);

                        if ( (LA4_13==28) ) {
                            int LA4_15 = input.LA(5);

                            if ( (LA4_15==EOF||LA4_15==16) ) {
                                alt4=1;
                            }
                            else if ( ((LA4_15>=33 && LA4_15<=36)) ) {
                                alt4=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("532:1: ( (lv_arg_0= ruleREGSARGS ) | ( (lv_larg_1= ruleREGSARGS ) (lv_aop_2= ruleAOPs ) (lv_rarg_3= ruleREGSARGS ) ) )", 4, 15, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("532:1: ( (lv_arg_0= ruleREGSARGS ) | ( (lv_larg_1= ruleREGSARGS ) (lv_aop_2= ruleAOPs ) (lv_rarg_3= ruleREGSARGS ) ) )", 4, 13, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 32:
                        {
                        int LA4_14 = input.LA(4);

                        if ( (LA4_14==28) ) {
                            int LA4_15 = input.LA(5);

                            if ( (LA4_15==EOF||LA4_15==16) ) {
                                alt4=1;
                            }
                            else if ( ((LA4_15>=33 && LA4_15<=36)) ) {
                                alt4=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("532:1: ( (lv_arg_0= ruleREGSARGS ) | ( (lv_larg_1= ruleREGSARGS ) (lv_aop_2= ruleAOPs ) (lv_rarg_3= ruleREGSARGS ) ) )", 4, 15, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("532:1: ( (lv_arg_0= ruleREGSARGS ) | ( (lv_larg_1= ruleREGSARGS ) (lv_aop_2= ruleAOPs ) (lv_rarg_3= ruleREGSARGS ) ) )", 4, 14, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("532:1: ( (lv_arg_0= ruleREGSARGS ) | ( (lv_larg_1= ruleREGSARGS ) (lv_aop_2= ruleAOPs ) (lv_rarg_3= ruleREGSARGS ) ) )", 4, 7, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("532:1: ( (lv_arg_0= ruleREGSARGS ) | ( (lv_larg_1= ruleREGSARGS ) (lv_aop_2= ruleAOPs ) (lv_rarg_3= ruleREGSARGS ) ) )", 4, 1, input);

                    throw nvae;
                }
                }
                break;
            case 24:
                {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==EOF||LA4_2==16) ) {
                    alt4=1;
                }
                else if ( ((LA4_2>=33 && LA4_2<=36)) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("532:1: ( (lv_arg_0= ruleREGSARGS ) | ( (lv_larg_1= ruleREGSARGS ) (lv_aop_2= ruleAOPs ) (lv_rarg_3= ruleREGSARGS ) ) )", 4, 2, input);

                    throw nvae;
                }
                }
                break;
            case 29:
                {
                int LA4_3 = input.LA(2);

                if ( (LA4_3==EOF||LA4_3==16) ) {
                    alt4=1;
                }
                else if ( ((LA4_3>=33 && LA4_3<=36)) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("532:1: ( (lv_arg_0= ruleREGSARGS ) | ( (lv_larg_1= ruleREGSARGS ) (lv_aop_2= ruleAOPs ) (lv_rarg_3= ruleREGSARGS ) ) )", 4, 3, input);

                    throw nvae;
                }
                }
                break;
            case 30:
                {
                int LA4_4 = input.LA(2);

                if ( (LA4_4==EOF||LA4_4==16) ) {
                    alt4=1;
                }
                else if ( ((LA4_4>=33 && LA4_4<=36)) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("532:1: ( (lv_arg_0= ruleREGSARGS ) | ( (lv_larg_1= ruleREGSARGS ) (lv_aop_2= ruleAOPs ) (lv_rarg_3= ruleREGSARGS ) ) )", 4, 4, input);

                    throw nvae;
                }
                }
                break;
            case 31:
                {
                int LA4_5 = input.LA(2);

                if ( (LA4_5==EOF||LA4_5==16) ) {
                    alt4=1;
                }
                else if ( ((LA4_5>=33 && LA4_5<=36)) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("532:1: ( (lv_arg_0= ruleREGSARGS ) | ( (lv_larg_1= ruleREGSARGS ) (lv_aop_2= ruleAOPs ) (lv_rarg_3= ruleREGSARGS ) ) )", 4, 5, input);

                    throw nvae;
                }
                }
                break;
            case 32:
                {
                int LA4_6 = input.LA(2);

                if ( (LA4_6==EOF||LA4_6==16) ) {
                    alt4=1;
                }
                else if ( ((LA4_6>=33 && LA4_6<=36)) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("532:1: ( (lv_arg_0= ruleREGSARGS ) | ( (lv_larg_1= ruleREGSARGS ) (lv_aop_2= ruleAOPs ) (lv_rarg_3= ruleREGSARGS ) ) )", 4, 6, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("532:1: ( (lv_arg_0= ruleREGSARGS ) | ( (lv_larg_1= ruleREGSARGS ) (lv_aop_2= ruleAOPs ) (lv_rarg_3= ruleREGSARGS ) ) )", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:532:2: (lv_arg_0= ruleREGSARGS )
                    {
                    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:532:2: (lv_arg_0= ruleREGSARGS )
                    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:535:6: lv_arg_0= ruleREGSARGS
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getRExpAccess().getArgREGSARGSParserRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleREGSARGS_in_ruleRExp1174);
                    lv_arg_0=ruleREGSARGS();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRExpRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "arg", lv_arg_0, "REGSARGS", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;
                case 2 :
                    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:554:6: ( (lv_larg_1= ruleREGSARGS ) (lv_aop_2= ruleAOPs ) (lv_rarg_3= ruleREGSARGS ) )
                    {
                    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:554:6: ( (lv_larg_1= ruleREGSARGS ) (lv_aop_2= ruleAOPs ) (lv_rarg_3= ruleREGSARGS ) )
                    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:554:7: (lv_larg_1= ruleREGSARGS ) (lv_aop_2= ruleAOPs ) (lv_rarg_3= ruleREGSARGS )
                    {
                    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:554:7: (lv_larg_1= ruleREGSARGS )
                    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:557:6: lv_larg_1= ruleREGSARGS
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getRExpAccess().getLargREGSARGSParserRuleCall_1_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleREGSARGS_in_ruleRExp1219);
                    lv_larg_1=ruleREGSARGS();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRExpRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "larg", lv_larg_1, "REGSARGS", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:575:2: (lv_aop_2= ruleAOPs )
                    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:578:6: lv_aop_2= ruleAOPs
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getRExpAccess().getAopAOPsParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAOPs_in_ruleRExp1257);
                    lv_aop_2=ruleAOPs();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRExpRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "aop", lv_aop_2, "AOPs", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:596:2: (lv_rarg_3= ruleREGSARGS )
                    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:599:6: lv_rarg_3= ruleREGSARGS
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getRExpAccess().getRargREGSARGSParserRuleCall_1_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleREGSARGS_in_ruleRExp1295);
                    lv_rarg_3=ruleREGSARGS();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRExpRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "rarg", lv_rarg_3, "REGSARGS", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleRExp


    // $ANTLR start entryRuleCondition
    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:624:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:624:51: (iv_ruleCondition= ruleCondition EOF )
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:625:2: iv_ruleCondition= ruleCondition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getConditionRule(), currentNode); 
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition1333);
            iv_ruleCondition=ruleCondition();
            _fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition1343); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCondition


    // $ANTLR start ruleCondition
    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:632:1: ruleCondition returns [EObject current=null] : ( 'if' '(' (lv_larg_2= ruleREGSARGS ) (lv_cmpop_3= ruleCMPOPs ) (lv_rarg_4= ruleREGSARGS ) ',' (lv_thentarget_6= ruleJMPTARGET ) ',' (lv_elsetarget_8= ruleJMPTARGET ) ')' ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject lv_larg_2 = null;

        AntlrDatatypeRuleToken lv_cmpop_3 = null;

        EObject lv_rarg_4 = null;

        AntlrDatatypeRuleToken lv_thentarget_6 = null;

        AntlrDatatypeRuleToken lv_elsetarget_8 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:637:6: ( ( 'if' '(' (lv_larg_2= ruleREGSARGS ) (lv_cmpop_3= ruleCMPOPs ) (lv_rarg_4= ruleREGSARGS ) ',' (lv_thentarget_6= ruleJMPTARGET ) ',' (lv_elsetarget_8= ruleJMPTARGET ) ')' ) )
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:638:1: ( 'if' '(' (lv_larg_2= ruleREGSARGS ) (lv_cmpop_3= ruleCMPOPs ) (lv_rarg_4= ruleREGSARGS ) ',' (lv_thentarget_6= ruleJMPTARGET ) ',' (lv_elsetarget_8= ruleJMPTARGET ) ')' )
            {
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:638:1: ( 'if' '(' (lv_larg_2= ruleREGSARGS ) (lv_cmpop_3= ruleCMPOPs ) (lv_rarg_4= ruleREGSARGS ) ',' (lv_thentarget_6= ruleJMPTARGET ) ',' (lv_elsetarget_8= ruleJMPTARGET ) ')' )
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:638:2: 'if' '(' (lv_larg_2= ruleREGSARGS ) (lv_cmpop_3= ruleCMPOPs ) (lv_rarg_4= ruleREGSARGS ) ',' (lv_thentarget_6= ruleJMPTARGET ) ',' (lv_elsetarget_8= ruleJMPTARGET ) ')'
            {
            match(input,20,FOLLOW_20_in_ruleCondition1377); 

                    createLeafNode(grammarAccess.getConditionAccess().getIfKeyword_0(), null); 
                
            match(input,21,FOLLOW_21_in_ruleCondition1386); 

                    createLeafNode(grammarAccess.getConditionAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:646:1: (lv_larg_2= ruleREGSARGS )
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:649:6: lv_larg_2= ruleREGSARGS
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getConditionAccess().getLargREGSARGSParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleREGSARGS_in_ruleCondition1420);
            lv_larg_2=ruleREGSARGS();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getConditionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "larg", lv_larg_2, "REGSARGS", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:667:2: (lv_cmpop_3= ruleCMPOPs )
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:670:6: lv_cmpop_3= ruleCMPOPs
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getConditionAccess().getCmpopCMPOPsParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleCMPOPs_in_ruleCondition1458);
            lv_cmpop_3=ruleCMPOPs();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getConditionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "cmpop", lv_cmpop_3, "CMPOPs", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:688:2: (lv_rarg_4= ruleREGSARGS )
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:691:6: lv_rarg_4= ruleREGSARGS
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getConditionAccess().getRargREGSARGSParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleREGSARGS_in_ruleCondition1496);
            lv_rarg_4=ruleREGSARGS();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getConditionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "rarg", lv_rarg_4, "REGSARGS", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,22,FOLLOW_22_in_ruleCondition1509); 

                    createLeafNode(grammarAccess.getConditionAccess().getCommaKeyword_5(), null); 
                
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:713:1: (lv_thentarget_6= ruleJMPTARGET )
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:716:6: lv_thentarget_6= ruleJMPTARGET
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getConditionAccess().getThentargetJMPTARGETParserRuleCall_6_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleJMPTARGET_in_ruleCondition1543);
            lv_thentarget_6=ruleJMPTARGET();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getConditionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "thentarget", lv_thentarget_6, "JMPTARGET", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,22,FOLLOW_22_in_ruleCondition1556); 

                    createLeafNode(grammarAccess.getConditionAccess().getCommaKeyword_7(), null); 
                
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:738:1: (lv_elsetarget_8= ruleJMPTARGET )
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:741:6: lv_elsetarget_8= ruleJMPTARGET
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getConditionAccess().getElsetargetJMPTARGETParserRuleCall_8_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleJMPTARGET_in_ruleCondition1590);
            lv_elsetarget_8=ruleJMPTARGET();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getConditionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "elsetarget", lv_elsetarget_8, "JMPTARGET", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,23,FOLLOW_23_in_ruleCondition1603); 

                    createLeafNode(grammarAccess.getConditionAccess().getRightParenthesisKeyword_9(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCondition


    // $ANTLR start entryRuleREGSARGS
    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:770:1: entryRuleREGSARGS returns [EObject current=null] : iv_ruleREGSARGS= ruleREGSARGS EOF ;
    public final EObject entryRuleREGSARGS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleREGSARGS = null;


        try {
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:770:50: (iv_ruleREGSARGS= ruleREGSARGS EOF )
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:771:2: iv_ruleREGSARGS= ruleREGSARGS EOF
            {
             currentNode = createCompositeNode(grammarAccess.getREGSARGSRule(), currentNode); 
            pushFollow(FOLLOW_ruleREGSARGS_in_entryRuleREGSARGS1636);
            iv_ruleREGSARGS=ruleREGSARGS();
            _fsp--;

             current =iv_ruleREGSARGS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleREGSARGS1646); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleREGSARGS


    // $ANTLR start ruleREGSARGS
    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:778:1: ruleREGSARGS returns [EObject current=null] : ( (lv_reg_0= ruleREGS ) | (lv_arg_1= ruleARGS ) ) ;
    public final EObject ruleREGSARGS() throws RecognitionException {
        EObject current = null;

        EObject lv_reg_0 = null;

        AntlrDatatypeRuleToken lv_arg_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:783:6: ( ( (lv_reg_0= ruleREGS ) | (lv_arg_1= ruleARGS ) ) )
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:784:1: ( (lv_reg_0= ruleREGS ) | (lv_arg_1= ruleARGS ) )
            {
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:784:1: ( (lv_reg_0= ruleREGS ) | (lv_arg_1= ruleARGS ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==26) ) {
                alt5=1;
            }
            else if ( (LA5_0==24||(LA5_0>=29 && LA5_0<=32)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("784:1: ( (lv_reg_0= ruleREGS ) | (lv_arg_1= ruleARGS ) )", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:784:2: (lv_reg_0= ruleREGS )
                    {
                    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:784:2: (lv_reg_0= ruleREGS )
                    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:787:6: lv_reg_0= ruleREGS
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getREGSARGSAccess().getRegREGSParserRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleREGS_in_ruleREGSARGS1705);
                    lv_reg_0=ruleREGS();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getREGSARGSRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "reg", lv_reg_0, "REGS", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;
                case 2 :
                    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:806:6: (lv_arg_1= ruleARGS )
                    {
                    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:806:6: (lv_arg_1= ruleARGS )
                    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:809:6: lv_arg_1= ruleARGS
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getREGSARGSAccess().getArgARGSParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleARGS_in_ruleREGSARGS1749);
                    lv_arg_1=ruleARGS();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getREGSARGSRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "arg", lv_arg_1, "ARGS", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleREGSARGS


    // $ANTLR start entryRuleJMPTARGET
    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:834:1: entryRuleJMPTARGET returns [String current=null] : iv_ruleJMPTARGET= ruleJMPTARGET EOF ;
    public final String entryRuleJMPTARGET() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleJMPTARGET = null;


        try {
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:834:50: (iv_ruleJMPTARGET= ruleJMPTARGET EOF )
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:835:2: iv_ruleJMPTARGET= ruleJMPTARGET EOF
            {
             currentNode = createCompositeNode(grammarAccess.getJMPTARGETRule(), currentNode); 
            pushFollow(FOLLOW_ruleJMPTARGET_in_entryRuleJMPTARGET1787);
            iv_ruleJMPTARGET=ruleJMPTARGET();
            _fsp--;

             current =iv_ruleJMPTARGET.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJMPTARGET1798); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleJMPTARGET


    // $ANTLR start ruleJMPTARGET
    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:842:1: ruleJMPTARGET returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'IM' | kw= 'NEXT' ) ;
    public final AntlrDatatypeRuleToken ruleJMPTARGET() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:848:6: ( (kw= 'IM' | kw= 'NEXT' ) )
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:849:1: (kw= 'IM' | kw= 'NEXT' )
            {
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:849:1: (kw= 'IM' | kw= 'NEXT' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            else if ( (LA6_0==25) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("849:1: (kw= 'IM' | kw= 'NEXT' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:850:2: kw= 'IM'
                    {
                    kw=(Token)input.LT(1);
                    match(input,24,FOLLOW_24_in_ruleJMPTARGET1836); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getJMPTARGETAccess().getIMKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:857:2: kw= 'NEXT'
                    {
                    kw=(Token)input.LT(1);
                    match(input,25,FOLLOW_25_in_ruleJMPTARGET1855); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getJMPTARGETAccess().getNEXTKeyword_1(), null); 
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
            	    lastConsumedDatatypeToken = current;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleJMPTARGET


    // $ANTLR start entryRuleREGS
    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:870:1: entryRuleREGS returns [EObject current=null] : iv_ruleREGS= ruleREGS EOF ;
    public final EObject entryRuleREGS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleREGS = null;


        try {
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:870:46: (iv_ruleREGS= ruleREGS EOF )
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:871:2: iv_ruleREGS= ruleREGS EOF
            {
             currentNode = createCompositeNode(grammarAccess.getREGSRule(), currentNode); 
            pushFollow(FOLLOW_ruleREGS_in_entryRuleREGS1893);
            iv_ruleREGS=ruleREGS();
            _fsp--;

             current =iv_ruleREGS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleREGS1903); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleREGS


    // $ANTLR start ruleREGS
    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:878:1: ruleREGS returns [EObject current=null] : ( 'regs' '[' (lv_arg_2= ruleARGS ) ']' ) ;
    public final EObject ruleREGS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_arg_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:883:6: ( ( 'regs' '[' (lv_arg_2= ruleARGS ) ']' ) )
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:884:1: ( 'regs' '[' (lv_arg_2= ruleARGS ) ']' )
            {
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:884:1: ( 'regs' '[' (lv_arg_2= ruleARGS ) ']' )
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:884:2: 'regs' '[' (lv_arg_2= ruleARGS ) ']'
            {
            match(input,26,FOLLOW_26_in_ruleREGS1937); 

                    createLeafNode(grammarAccess.getREGSAccess().getRegsKeyword_0(), null); 
                
            match(input,27,FOLLOW_27_in_ruleREGS1946); 

                    createLeafNode(grammarAccess.getREGSAccess().getLeftSquareBracketKeyword_1(), null); 
                
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:892:1: (lv_arg_2= ruleARGS )
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:895:6: lv_arg_2= ruleARGS
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getREGSAccess().getArgARGSParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleARGS_in_ruleREGS1980);
            lv_arg_2=ruleARGS();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getREGSRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "arg", lv_arg_2, "ARGS", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,28,FOLLOW_28_in_ruleREGS1993); 

                    createLeafNode(grammarAccess.getREGSAccess().getRightSquareBracketKeyword_3(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleREGS


    // $ANTLR start entryRuleARGS
    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:924:1: entryRuleARGS returns [String current=null] : iv_ruleARGS= ruleARGS EOF ;
    public final String entryRuleARGS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleARGS = null;


        try {
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:924:45: (iv_ruleARGS= ruleARGS EOF )
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:925:2: iv_ruleARGS= ruleARGS EOF
            {
             currentNode = createCompositeNode(grammarAccess.getARGSRule(), currentNode); 
            pushFollow(FOLLOW_ruleARGS_in_entryRuleARGS2027);
            iv_ruleARGS=ruleARGS();
            _fsp--;

             current =iv_ruleARGS.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleARGS2038); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleARGS


    // $ANTLR start ruleARGS
    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:932:1: ruleARGS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'IM' | kw= 'RD' | kw= 'RS' | kw= 'RT' | kw= 'addr' ) ;
    public final AntlrDatatypeRuleToken ruleARGS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:938:6: ( (kw= 'IM' | kw= 'RD' | kw= 'RS' | kw= 'RT' | kw= 'addr' ) )
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:939:1: (kw= 'IM' | kw= 'RD' | kw= 'RS' | kw= 'RT' | kw= 'addr' )
            {
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:939:1: (kw= 'IM' | kw= 'RD' | kw= 'RS' | kw= 'RT' | kw= 'addr' )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt7=1;
                }
                break;
            case 29:
                {
                alt7=2;
                }
                break;
            case 30:
                {
                alt7=3;
                }
                break;
            case 31:
                {
                alt7=4;
                }
                break;
            case 32:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("939:1: (kw= 'IM' | kw= 'RD' | kw= 'RS' | kw= 'RT' | kw= 'addr' )", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:940:2: kw= 'IM'
                    {
                    kw=(Token)input.LT(1);
                    match(input,24,FOLLOW_24_in_ruleARGS2076); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getARGSAccess().getIMKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:947:2: kw= 'RD'
                    {
                    kw=(Token)input.LT(1);
                    match(input,29,FOLLOW_29_in_ruleARGS2095); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getARGSAccess().getRDKeyword_1(), null); 
                        

                    }
                    break;
                case 3 :
                    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:954:2: kw= 'RS'
                    {
                    kw=(Token)input.LT(1);
                    match(input,30,FOLLOW_30_in_ruleARGS2114); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getARGSAccess().getRSKeyword_2(), null); 
                        

                    }
                    break;
                case 4 :
                    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:961:2: kw= 'RT'
                    {
                    kw=(Token)input.LT(1);
                    match(input,31,FOLLOW_31_in_ruleARGS2133); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getARGSAccess().getRTKeyword_3(), null); 
                        

                    }
                    break;
                case 5 :
                    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:968:2: kw= 'addr'
                    {
                    kw=(Token)input.LT(1);
                    match(input,32,FOLLOW_32_in_ruleARGS2152); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getARGSAccess().getAddrKeyword_4(), null); 
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
            	    lastConsumedDatatypeToken = current;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleARGS


    // $ANTLR start entryRuleAOPs
    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:981:1: entryRuleAOPs returns [String current=null] : iv_ruleAOPs= ruleAOPs EOF ;
    public final String entryRuleAOPs() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAOPs = null;


        try {
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:981:45: (iv_ruleAOPs= ruleAOPs EOF )
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:982:2: iv_ruleAOPs= ruleAOPs EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAOPsRule(), currentNode); 
            pushFollow(FOLLOW_ruleAOPs_in_entryRuleAOPs2191);
            iv_ruleAOPs=ruleAOPs();
            _fsp--;

             current =iv_ruleAOPs.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAOPs2202); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAOPs


    // $ANTLR start ruleAOPs
    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:989:1: ruleAOPs returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '*' | kw= '/' ) ;
    public final AntlrDatatypeRuleToken ruleAOPs() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:995:6: ( (kw= '+' | kw= '-' | kw= '*' | kw= '/' ) )
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:996:1: (kw= '+' | kw= '-' | kw= '*' | kw= '/' )
            {
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:996:1: (kw= '+' | kw= '-' | kw= '*' | kw= '/' )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt8=1;
                }
                break;
            case 34:
                {
                alt8=2;
                }
                break;
            case 35:
                {
                alt8=3;
                }
                break;
            case 36:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("996:1: (kw= '+' | kw= '-' | kw= '*' | kw= '/' )", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:997:2: kw= '+'
                    {
                    kw=(Token)input.LT(1);
                    match(input,33,FOLLOW_33_in_ruleAOPs2240); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getAOPsAccess().getPlusSignKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:1004:2: kw= '-'
                    {
                    kw=(Token)input.LT(1);
                    match(input,34,FOLLOW_34_in_ruleAOPs2259); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getAOPsAccess().getHyphenMinusKeyword_1(), null); 
                        

                    }
                    break;
                case 3 :
                    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:1011:2: kw= '*'
                    {
                    kw=(Token)input.LT(1);
                    match(input,35,FOLLOW_35_in_ruleAOPs2278); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getAOPsAccess().getAsteriskKeyword_2(), null); 
                        

                    }
                    break;
                case 4 :
                    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:1018:2: kw= '/'
                    {
                    kw=(Token)input.LT(1);
                    match(input,36,FOLLOW_36_in_ruleAOPs2297); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getAOPsAccess().getSolidusKeyword_3(), null); 
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
            	    lastConsumedDatatypeToken = current;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAOPs


    // $ANTLR start entryRuleCMPOPs
    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:1031:1: entryRuleCMPOPs returns [String current=null] : iv_ruleCMPOPs= ruleCMPOPs EOF ;
    public final String entryRuleCMPOPs() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCMPOPs = null;


        try {
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:1031:47: (iv_ruleCMPOPs= ruleCMPOPs EOF )
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:1032:2: iv_ruleCMPOPs= ruleCMPOPs EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCMPOPsRule(), currentNode); 
            pushFollow(FOLLOW_ruleCMPOPs_in_entryRuleCMPOPs2336);
            iv_ruleCMPOPs=ruleCMPOPs();
            _fsp--;

             current =iv_ruleCMPOPs.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCMPOPs2347); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCMPOPs


    // $ANTLR start ruleCMPOPs
    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:1039:1: ruleCMPOPs returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' ) ;
    public final AntlrDatatypeRuleToken ruleCMPOPs() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:1045:6: ( (kw= '==' | kw= '!=' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' ) )
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:1046:1: (kw= '==' | kw= '!=' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' )
            {
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:1046:1: (kw= '==' | kw= '!=' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' )
            int alt9=6;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt9=1;
                }
                break;
            case 38:
                {
                alt9=2;
                }
                break;
            case 39:
                {
                alt9=3;
                }
                break;
            case 40:
                {
                alt9=4;
                }
                break;
            case 41:
                {
                alt9=5;
                }
                break;
            case 42:
                {
                alt9=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1046:1: (kw= '==' | kw= '!=' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' )", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:1047:2: kw= '=='
                    {
                    kw=(Token)input.LT(1);
                    match(input,37,FOLLOW_37_in_ruleCMPOPs2385); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getCMPOPsAccess().getEqualsSignEqualsSignKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:1054:2: kw= '!='
                    {
                    kw=(Token)input.LT(1);
                    match(input,38,FOLLOW_38_in_ruleCMPOPs2404); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getCMPOPsAccess().getExclamationMarkEqualsSignKeyword_1(), null); 
                        

                    }
                    break;
                case 3 :
                    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:1061:2: kw= '<'
                    {
                    kw=(Token)input.LT(1);
                    match(input,39,FOLLOW_39_in_ruleCMPOPs2423); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getCMPOPsAccess().getLessThanSignKeyword_2(), null); 
                        

                    }
                    break;
                case 4 :
                    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:1068:2: kw= '>'
                    {
                    kw=(Token)input.LT(1);
                    match(input,40,FOLLOW_40_in_ruleCMPOPs2442); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getCMPOPsAccess().getGreaterThanSignKeyword_3(), null); 
                        

                    }
                    break;
                case 5 :
                    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:1075:2: kw= '<='
                    {
                    kw=(Token)input.LT(1);
                    match(input,41,FOLLOW_41_in_ruleCMPOPs2461); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getCMPOPsAccess().getLessThanSignEqualsSignKeyword_4(), null); 
                        

                    }
                    break;
                case 6 :
                    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:1082:2: kw= '>='
                    {
                    kw=(Token)input.LT(1);
                    match(input,42,FOLLOW_42_in_ruleCMPOPs2480); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getCMPOPsAccess().getGreaterThanSignEqualsSignKeyword_5(), null); 
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
            	    lastConsumedDatatypeToken = current;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCMPOPs


    // $ANTLR start entryRuleInstTypeLabel
    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:1095:1: entryRuleInstTypeLabel returns [String current=null] : iv_ruleInstTypeLabel= ruleInstTypeLabel EOF ;
    public final String entryRuleInstTypeLabel() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInstTypeLabel = null;


        try {
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:1095:54: (iv_ruleInstTypeLabel= ruleInstTypeLabel EOF )
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:1096:2: iv_ruleInstTypeLabel= ruleInstTypeLabel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInstTypeLabelRule(), currentNode); 
            pushFollow(FOLLOW_ruleInstTypeLabel_in_entryRuleInstTypeLabel2519);
            iv_ruleInstTypeLabel=ruleInstTypeLabel();
            _fsp--;

             current =iv_ruleInstTypeLabel.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstTypeLabel2530); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleInstTypeLabel


    // $ANTLR start ruleInstTypeLabel
    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:1103:1: ruleInstTypeLabel returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'r' | kw= 'i' | kw= 'j' ) ;
    public final AntlrDatatypeRuleToken ruleInstTypeLabel() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:1109:6: ( (kw= 'r' | kw= 'i' | kw= 'j' ) )
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:1110:1: (kw= 'r' | kw= 'i' | kw= 'j' )
            {
            // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:1110:1: (kw= 'r' | kw= 'i' | kw= 'j' )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt10=1;
                }
                break;
            case 44:
                {
                alt10=2;
                }
                break;
            case 45:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1110:1: (kw= 'r' | kw= 'i' | kw= 'j' )", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:1111:2: kw= 'r'
                    {
                    kw=(Token)input.LT(1);
                    match(input,43,FOLLOW_43_in_ruleInstTypeLabel2568); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getInstTypeLabelAccess().getRKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:1118:2: kw= 'i'
                    {
                    kw=(Token)input.LT(1);
                    match(input,44,FOLLOW_44_in_ruleInstTypeLabel2587); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getInstTypeLabelAccess().getIKeyword_1(), null); 
                        

                    }
                    break;
                case 3 :
                    // ../nel.Mcore/src-gen/nel/parser/antlr/internal/InternalMcore.g:1125:2: kw= 'j'
                    {
                    kw=(Token)input.LT(1);
                    match(input,45,FOLLOW_45_in_ruleInstTypeLabel2606); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getInstTypeLabelAccess().getJKeyword_2(), null); 
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
            	    lastConsumedDatatypeToken = current;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleInstTypeLabel


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel73 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleModel141 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleInstruction_in_entryRuleInstruction178 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstruction188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleInstruction222 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInstruction244 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleInstruction261 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleInstType_in_ruleInstruction295 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleCoding_in_ruleInstruction333 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleBehavior_in_ruleInstruction371 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleInstruction384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstType_in_entryRuleInstType417 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstType427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleInstType461 = new BitSet(new long[]{0x0000380000000000L});
    public static final BitSet FOLLOW_ruleInstTypeLabel_in_ruleInstType495 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleInstType508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCoding_in_entryRuleCoding541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCoding551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleCoding585 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_BINARY_in_ruleCoding607 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCoding624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBehavior_in_entryRuleBehavior657 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBehavior667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleBehavior701 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleBehavior710 = new BitSet(new long[]{0x0000000004104000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBehavior746 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleBehavior790 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleBehavior804 = new BitSet(new long[]{0x0000000004104000L});
    public static final BitSet FOLLOW_14_in_ruleBehavior815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLExp_in_ruleExpression917 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleExpression930 = new BitSet(new long[]{0x00000001E5000000L});
    public static final BitSet FOLLOW_ruleRExp_in_ruleExpression964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLExp_in_entryRuleLExp1001 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLExp1011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREGS_in_ruleLExp1069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRExp_in_entryRuleRExp1105 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRExp1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREGSARGS_in_ruleRExp1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREGSARGS_in_ruleRExp1219 = new BitSet(new long[]{0x0000001E00000000L});
    public static final BitSet FOLLOW_ruleAOPs_in_ruleRExp1257 = new BitSet(new long[]{0x00000001E5000000L});
    public static final BitSet FOLLOW_ruleREGSARGS_in_ruleRExp1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition1333 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition1343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleCondition1377 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleCondition1386 = new BitSet(new long[]{0x00000001E5000000L});
    public static final BitSet FOLLOW_ruleREGSARGS_in_ruleCondition1420 = new BitSet(new long[]{0x000007E000000000L});
    public static final BitSet FOLLOW_ruleCMPOPs_in_ruleCondition1458 = new BitSet(new long[]{0x00000001E5000000L});
    public static final BitSet FOLLOW_ruleREGSARGS_in_ruleCondition1496 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleCondition1509 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_ruleJMPTARGET_in_ruleCondition1543 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleCondition1556 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_ruleJMPTARGET_in_ruleCondition1590 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleCondition1603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREGSARGS_in_entryRuleREGSARGS1636 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleREGSARGS1646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREGS_in_ruleREGSARGS1705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleARGS_in_ruleREGSARGS1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJMPTARGET_in_entryRuleJMPTARGET1787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJMPTARGET1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleJMPTARGET1836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleJMPTARGET1855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREGS_in_entryRuleREGS1893 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleREGS1903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleREGS1937 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleREGS1946 = new BitSet(new long[]{0x00000001E1000000L});
    public static final BitSet FOLLOW_ruleARGS_in_ruleREGS1980 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleREGS1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleARGS_in_entryRuleARGS2027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleARGS2038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleARGS2076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleARGS2095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleARGS2114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleARGS2133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleARGS2152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAOPs_in_entryRuleAOPs2191 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAOPs2202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleAOPs2240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleAOPs2259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleAOPs2278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleAOPs2297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCMPOPs_in_entryRuleCMPOPs2336 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCMPOPs2347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleCMPOPs2385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleCMPOPs2404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleCMPOPs2423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleCMPOPs2442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleCMPOPs2461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleCMPOPs2480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstTypeLabel_in_entryRuleInstTypeLabel2519 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstTypeLabel2530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleInstTypeLabel2568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleInstTypeLabel2587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleInstTypeLabel2606 = new BitSet(new long[]{0x0000000000000002L});

}