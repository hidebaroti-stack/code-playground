##Ask the user to enter a sentence. Count the number of words, print it reversed word-by-word, and check if it is a palindrome (ignoring spaces and case).

sentence = input("Enter a sentence: ")
# Count the number of words
word_count = len(sentence.split())
print("Number of words: ", word_count)  
# Reverse the sentence word-by-word
reversed_sentence = ' '.join(sentence.split()[::-1])
print("Reversed sentence: ", reversed_sentence)
# Check if the sentence is a palindrome (ignoring spaces and case)
normalized_sentence = sentence.replace(" ", "").lower() 
if normalized_sentence == normalized_sentence[::-1]:
    print("The sentence is a palindrome.")
else:    
    print("The sentence is not a palindrome.")
