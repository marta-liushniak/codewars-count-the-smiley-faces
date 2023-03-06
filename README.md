Complete the countSmileys() method that should return the total number of smiling faces.

Rules for a smiling face:

1. Each smiley face **must contain a valid pair of eyes**. Eyes can be marked as *:* or *;*
2. A smiley face **can have a nose, but it does not have to**. Valid characters for a nose are *-* or *~*
3. Every smiling face **must have a smiling mouth** that should be marked with either *)* or *D*
4. **No additional characters are allowed except for those mentioned**.

Valid smiley face examples: *:) :D ;-D :~)*
Invalid smiley faces: *;( :> :} :]*

Example:  
`countSmileys([':)', ';(', ';}', ':-D']);`       // should return *2*;  
`countSmileys([';D', ':-(', ':-)', ';~)']);`     // should return *3*;  
`countSmileys([';]', ':[', ';*', ':$', ';-D']);` // should return *1*;  

Note:
In case of an empty array return 0. Order of the face (eyes, nose, mouth) elements will always be the same.