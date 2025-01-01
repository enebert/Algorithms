module Sorts(
    firstElement,
    findElement,
    insertionSort,
    mergeSort,
    quickSort,
    selectionSort
)
    where
    
    maxElement :: Ord a => [a] -> a
    maxElement [x] = x
    maxElement (x:y:xs)
        | x>=y = maxElement (x:xs)
        | x<y = maxElement (y:xs)
        
    minElement :: Ord a => [a] -> a
    minElement [x] = x
    minElement (x:y:xs)
        | x<=y = minElement(x:xs)
        | x>y = minElement (y:xs)
    
    
    firstElement :: [a] -> Maybe a
    firstElement [] = Nothing
    firstElement (x:xs) = Just x
    
    findElement :: Eq a => a -> [a] -> Maybe a
    findElement p [] = Nothing
    findElement p (x:xs) 
        | p==x = Just x
        | otherwise = findElement p xs
        
    removeElement n [] = []
    removeElement n (x:xs)
        | n==x = removeElement n xs
        | otherwise = x : removeElement n xs
        
    selectionSort [] = []
    selectionSort xs = do
        u : selectionSort (removeElement u xs)
        where
            u = minElement xs
   
        
    insertionSort :: Ord a => [a] -> [a]
    insertionSort [] = []
    insertionSort (x:xs) = insert x (insertionSort xs)
    
    insert :: Ord a => a -> [a] -> [a]
    insert n [] = [n]
    insert n (x:xs)
        | n <= x = n:x:xs
        | otherwise = x : insert n xs
    
    
    merge :: Ord a => [a] -> [a] -> [a]
    merge [] [] = []
    merge xs [] = xs
    merge [] ys = ys
    merge xs ys = do
        if x < y then x : merge (tail xs) ys
            else y : merge xs (tail ys)
        where
            x = head xs
            y = head ys
    
    mergeSort :: Ord a => [a] -> [a]
    mergeSort [] = []
    mergeSort [x] = [x]
    mergeSort xs = merge (mergeSort left) (mergeSort right)
        where
            (left,right) = splitAt (div (length xs) 2) xs
    
    
    quickSort [] = []
    quickSort (pivot : xs) = 
        quickSort [x | x<-xs, x<=pivot] ++
        [pivot] ++
        quickSort [x | x<-xs, x>pivot]
        
    
        
    
    
    