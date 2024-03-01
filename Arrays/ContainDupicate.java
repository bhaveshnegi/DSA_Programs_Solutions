class  ContainDupicate(object):
    def containsDuplicate(self, nums):
        hashset = set()
        for n in nums:
            if n in hashset:
                print("True")
                return True  
            hashset.add(n)
        print("False")
        return False  