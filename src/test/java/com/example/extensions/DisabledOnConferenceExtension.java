package com.example.extensions;

import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ExecutionCondition;
import org.junit.jupiter.api.extension.ExtensionContext;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DisabledOnConferenceExtension implements ExecutionCondition {
	@Override
	public ConditionEvaluationResult evaluateExecutionCondition(ExtensionContext context) {
		return LocalDate.now().getDayOfWeek() == DayOfWeek.WEDNESDAY
				? ConditionEvaluationResult.disabled("You're at solutions.hamburg!")
				: ConditionEvaluationResult.enabled("Get some work done!!!");
	}
}
