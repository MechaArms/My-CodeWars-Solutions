'''
Write a function that takes in a string of one or more words, and returns the same string, but with all five or more letter words reversed (Just like the name of this Kata). Strings passed in will consist of only letters and spaces. Spaces will be included only when more than one word is present.

Examples: spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw" spinWords( "This is a test") => returns "This is a test" spinWords( "This is another test" )=> returns "This is rehtona test"
'''

def spin_words(sentence):
    s = []
    inv = []
    if len(sentence) <= 5:
        x = sentence
    elif len(sentence) > 5 and ' ' not in sentence:
        x = sentence[::-1]
    else:
        s = sentence.split(" ")
        for i in range (len(s)):
            if i == 0 and len(s[i]) < 5:
                inv.append(s[i])
            else:
                a = s[i]
                if len(a) < 5:
                    inv.append(a)
                else:
                    a = a[::-1]
                    inv.append(a)           
        resp = ' '.join(inv)
        x = resp
    return x
